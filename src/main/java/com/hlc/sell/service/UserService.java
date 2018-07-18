package com.hlc.sell.service;

import com.hlc.sell.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
public interface UserService {
    
    public int insert(User user);

    public void update(User user);

    public User find(String name);

//    public void delete(String name);
    
}
