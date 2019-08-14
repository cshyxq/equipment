package com.equipment.service;

import com.equipment.mapper.UserMapper;
import com.equipment.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
  private UserMapper userDao;
    public List<User> list(User user) {
        return userDao.getUsers(user);
    }


    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
}
