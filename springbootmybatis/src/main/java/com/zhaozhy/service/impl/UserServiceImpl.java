package com.zhaozhy.service.impl;/*
 * @author zzy
 *
 */

import com.zhaozhy.mapper.UserMapper;
import com.zhaozhy.pojo.User;
import com.zhaozhy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        this.userMapper.insertUser(user);

    }
}
