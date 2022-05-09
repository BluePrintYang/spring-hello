package com.yonglone.springhello.service;

import com.yonglone.springhello.entity.User;

import java.util.List;

/**
 * @author yangllong
 * @date 2022/5/9 15:50
 */
public interface UserService {
    void addUser(User user);

    List<User> list();
}
