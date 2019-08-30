package com.equipment.mapper;

import com.equipment.entity.User;
import org.apache.ibatis.annotations.Param;

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
    public List<User> oneUser(@Param("u_id") String u_id,@Param("u_sex") String u_sex);
    //批量删除
    public void deleteMany(@Param("arr") String [] id_arr);
}
