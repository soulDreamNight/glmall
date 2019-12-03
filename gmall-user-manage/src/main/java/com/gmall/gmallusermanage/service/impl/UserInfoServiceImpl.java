package com.gmall.gmallusermanage.service.impl;

import com.gmall.gmallusermanage.bean.UserInfo;
import com.gmall.gmallusermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements com.gmall.gmallusermanage.service.UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();

    }

    @Override
    public UserInfo selectById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);

    }

    @Override
    public List<UserInfo> selectFind(UserInfo userInfo) {
        return userInfoMapper.select(userInfo);

    }

    @Override
    public List<UserInfo> selectExample(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("nickName","%"+userInfo.getNickName()+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updataUser(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("loginName",userInfo.getLoginName());
        userInfoMapper.updateByExampleSelective(userInfo,example);

    }

    @Override
    public void delUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }
}
