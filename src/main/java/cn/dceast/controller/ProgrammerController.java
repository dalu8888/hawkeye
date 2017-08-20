package cn.dceast.controller;

import cn.dceast.model.Programmer;
import cn.dceast.service.ProgrammerService;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanggw on 17/5/9.
 */
@Controller
@RequestMapping("/programmer")
@Api(tags = {"programmer"})
public class ProgrammerController {

    @Autowired
    private ProgrammerService programmerService;

    @ApiOperation(value = "查询所以项目",notes = "查询所有项目注意事项",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/list",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getAllProgrammer(ModelMap map, HttpServletRequest request){
        map.put("programmers", programmerService.selectAll());
        return "programmer/list";
    }

}
