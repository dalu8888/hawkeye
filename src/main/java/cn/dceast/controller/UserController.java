package cn.dceast.controller;

import cn.dceast.model.User;
import cn.dceast.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wanggw on 17/5/9.
 */
@Controller
@RequestMapping("/user")
@Api(tags = {"user"})
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户信息", notes = "查询所有用户信息 ...")
//    map形式带参写法
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "person", value = "包含book id的Map对象，Map中必须包含key 'id'，key 'id'对应的值就是book id。示例：{\"id\":\"36\"}", required = true, dataType = "string", defaultValue = "{\"id\":\"36\"}")
//    })
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getAllProgrammer(ModelMap map, HttpServletRequest request){

        map.put("users", userService.getAllUser());

        return "user/list";
    }

}
