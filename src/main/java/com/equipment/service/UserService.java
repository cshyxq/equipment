package com.equipment.service;

import com.equipment.entity.User;

import java.util.List;

public interface UserService {
    public List <User>  list (User user);
    public int  insertUser(User user);
    public void deleteUser(String u_id);
    public  int updateUser(User user);
    public  List<User> oneUser(String u_id,String u_sex);
    public void deleteMany(String [] id_arr);
}
