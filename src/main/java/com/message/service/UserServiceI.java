package com.message.service;

import com.message.entity.User;

/**
 * Created by wuph on 2015/11/9.
 */
public interface UserServiceI {
    void addUser(User user);
    User getUserById(int userId);
}
