package com.equipment.mapper;

import com.equipment.entity.User;

import java.util.List;

public interface UserMapper {
//    查找所有数据
   public   List<User> getUsers(User user);
   //添加用户
   public  int insertUser(User user);
}
