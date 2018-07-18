package com.hlc.sell.mapper;

import com.hlc.sell.entity.User;
import com.hlc.sell.utils.MyMapper;
import org.apache.ibatis.annotations.*;

/**
 * @Author rjyx
 * @Description
 * @Date create in 2018/6/27
 * @Modify by
 */
@Mapper
public interface UserMapper  extends MyMapper<User> {
//     @Insert("INSERT INTO USER(Name,Age) VALUES(#{name},#{age})")
     int insert(User user);
//     @Update("UPDATE USER SET Name=#{name},Age=#{age}  WHERE Name=#{name}")
     void update(User user);
//     @Delete("DELETE FROM USER WHERE Name=#{name}")
//     void delete(String name);
//     @Select(" SELECT * FROM USER WHERE Name=#{name}")
     User find(String name);

}
