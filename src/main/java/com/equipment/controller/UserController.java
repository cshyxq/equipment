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
//    查询单个用户
@RequestMapping("/oneUser")
@ResponseBody
public Object one(String u_id,Model model){
    User one = userService.oneUser(u_id);
    String objectOne = JSONObject.toJSONString(one);//转换成json格式
    System.out.println("打印查询单个");
    return objectOne;
}
//增加用户信息
    @RequestMapping("/addUser")
    @ResponseBody
    public  Object insert(User add){
        System.out.println("打印添加");
      int  row = userService.insertUser(add);
      if (row>0){
          return "OK";
      }else {
          return "Fail";
      }

    }
    //刪除用戶信息
    @RequestMapping("/deleteUser")
    @ResponseBody
    public Object delete(String  u_id){
        System.out.println("删除成功");
       userService.deleteUser(u_id);
        return true;

    }
    //修改用户
    @RequestMapping("/updateUser")
    @ResponseBody
    public Object update(User update){
        System.out.println("打印更改");
        int  row = userService.updateUser(update);
        if (row>0){
            return "OK";
        }else {
            return "Fail";
        }
    }
}
