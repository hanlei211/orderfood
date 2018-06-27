package com.hlc.sell.service.impl;

import com.hlc.sell.entity.User;
import com.hlc.sell.mapper.UserMapper;
import com.hlc.sell.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
@Service(value = "UserService")
public class UserServiceImpl implements UserSerivce {

    @Autowired
    public UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User find(String name) {
        return userMapper.find(name);
    }

    @Override
    public void delete(String name) {
        userMapper.delete(name);
    }
}
