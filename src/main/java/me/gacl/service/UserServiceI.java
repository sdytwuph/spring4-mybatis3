package me.gacl.service;

import me.gacl.domain.User;

import java.util.List;

/**
 * Created by wuph on 2015/11/9.
 */
public interface UserServiceI {
    void addUser(User user);
    User getUserById(String userId);
    List<User> getAllUser();
}
