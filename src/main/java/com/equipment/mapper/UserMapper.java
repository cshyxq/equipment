package com.equipment.mapper;

import com.equipment.entity.User;

import java.util.List;

public interface UserMapper {
//    查找所有数据
   public   List<User> getUsers(User user);
   //添加用户
   public  int insertUser(User user);
   //刪除用戶
   public  void  deleteUser(String u_id);
   //修改用户
   public  int updateUser(User user);
   //查询搜索信息
    public User oneUser(String u_id);
    public User serchPhone(String u_phone);
}
