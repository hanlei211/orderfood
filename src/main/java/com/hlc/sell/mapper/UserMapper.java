package com.hlc.sell.mapper;

import com.hlc.sell.entity.User;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
@Mapper
public interface UserMapper  extends MyMapper<User> {

     int insert(User user);

     void update(User user);

     void delete(String name);

     User find(String name);
}
