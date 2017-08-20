package cn.dceast.dao;

import cn.dceast.common.generator.MyMapper;
import cn.dceast.model.Programmer;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProgrammerMapper extends MyMapper<Programmer> {
}