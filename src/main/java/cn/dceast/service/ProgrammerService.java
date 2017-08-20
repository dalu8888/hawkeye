package cn.dceast.service;

import cn.dceast.dao.ProgrammerMapper;
import cn.dceast.model.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerService {

    @Autowired
    private ProgrammerMapper programmerMapper;


    public List<Programmer> selectAll() {
        return programmerMapper.selectAll();
    }
}
