package com.gmall.usermanager.service;



import com.gmall.usermanager.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoListAll();


    List<UserInfo> selectUserByCondition(UserInfo key);

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);
}
