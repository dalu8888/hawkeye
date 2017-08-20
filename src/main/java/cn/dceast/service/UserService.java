package cn.dceast.service;

import cn.dceast.dao.UserMapper;
import cn.dceast.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
}
