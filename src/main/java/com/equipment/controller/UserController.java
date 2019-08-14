package com.equipment.controller;


import com.alibaba.fastjson.JSONObject;
import com.equipment.entity.User;
import com.equipment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Console;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    查询所有用户信息
    @RequestMapping("/userList")
    @ResponseBody
    public Object list(User user,Model model){
        List<User>listU=userService.list(user);
        String objectStr = JSONObject.toJSONString(listU);//转换成json格式
        System.out.println("打印查询");
        return objectStr;
    }
//增加用户信息
    @RequestMapping("/addUser")
    @ResponseBody
    public  Object insert(User add){
        System.out.println(add);
      int  row = userService.insertUser(add);
      if (row>0){
          return "OK";
      }else {
          return "Fail";
      }

    }
}
