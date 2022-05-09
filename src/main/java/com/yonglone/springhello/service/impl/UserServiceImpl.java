package com.yonglone.springhello.service.impl;

import com.yonglone.springhello.dao.UserRepository;
import com.yonglone.springhello.entity.User;
import com.yonglone.springhello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user service impl.
 *
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * user dao.
     */
    @Autowired
    private UserRepository userDao;

    /**
     * @param user user
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> list() {
        return userDao.findAll();
    }

}
