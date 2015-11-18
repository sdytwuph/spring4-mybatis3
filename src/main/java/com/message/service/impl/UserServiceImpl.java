package com.message.service.impl;

import com.message.dao.UserMapper;
import com.message.entity.User;
import com.message.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuph on 2015/11/9.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service("userService")

public class UserServiceImpl implements UserServiceI {
    //    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserMapper userMapper;//注入dao

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
