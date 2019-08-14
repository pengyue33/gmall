package com.gmall.usermanager.service.impl;

import com.gmall.usermanager.bean.UserInfo;
import com.gmall.usermanager.mapper.UserInfoMapper;
import com.gmall.usermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserviceInfoServiceImpl implements UserInfoService {
      @Autowired
      UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos ;
    }

    @Override
    public List<UserInfo> selectUserByCondition(UserInfo userInfo) {
        List<UserInfo> list = userInfoMapper.select(userInfo);
          return list;
    }

    @Override
    public void addUser(UserInfo userInfo) {
         userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }
}
