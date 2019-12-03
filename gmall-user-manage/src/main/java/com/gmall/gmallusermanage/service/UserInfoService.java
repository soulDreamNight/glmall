package com.gmall.gmallusermanage.service;

import com.gmall.gmallusermanage.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();

    UserInfo selectById(String id);

    List<UserInfo> selectFind(UserInfo userInfo);

    List<UserInfo> selectExample(UserInfo userInfo);

    void addUser(UserInfo userInfo);

    void updataUser(UserInfo userInfo);

    void delUser(UserInfo userInfo);
}
