package com.gmall.gmallusermanage.controller;

import com.gmall.gmallusermanage.bean.UserInfo;
import com.gmall.gmallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @GetMapping("findAll")
    public List<UserInfo> findAll(UserInfo userInfo){
        return userInfoService.findAll();
    }
    @GetMapping("selectById")
    public UserInfo selectById(String id){
        return userInfoService.selectById(id);
    }
    @GetMapping("selectFind")
    public List<UserInfo> selectFind(UserInfo userInfo){
        return userInfoService.selectFind(userInfo);
    }
    @GetMapping("selectExample")
    public List<UserInfo> selectExample(UserInfo userInfo){
        return userInfoService.selectExample(userInfo);
    }
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }
    @RequestMapping("updataUser")
    public void updataUser(UserInfo userInfo){
        userInfoService.updataUser(userInfo);
    }
    @RequestMapping("delUser")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
    }


}
