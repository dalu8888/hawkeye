package cn.dceast.dao;

import cn.dceast.common.generator.MyMapper;
import cn.dceast.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends MyMapper<User> {
}