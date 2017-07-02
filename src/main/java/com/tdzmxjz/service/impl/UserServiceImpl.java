package com.tdzmxjz.service.impl;

import com.tdzmxjz.dao.UserMapper;
import com.tdzmxjz.entity.User;
import com.tdzmxjz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Tdz on 2017-7-2.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
      userMapper.insert(user);
    }
}
