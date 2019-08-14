package com.equipment.service;

import com.equipment.entity.User;

import java.util.List;

public interface UserService {
    public List <User>  list (User user);
    public int  insertUser(User user);
}
