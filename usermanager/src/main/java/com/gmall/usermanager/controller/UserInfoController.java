package com.gmall.usermanager.controller;

import com.gmall.usermanager.bean.UserInfo;
import com.gmall.usermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("getAll")
    public List<UserInfo> getUserInfoListAll() {

        return userInfoService.getUserInfoListAll();
    }

    @GetMapping("getUserByCondition")
    public List<UserInfo> selectByPrimaryKey(UserInfo userInfo) {

        return userInfoService.selectUserByCondition(userInfo);
    }

    @GetMapping("add")
    public void addUser(UserInfo userInfo) {
        userInfo.setLoginName("py");
        userInfo.setNickName("py333");

        userInfoService.addUser(userInfo);
    }

    @GetMapping("update")
    public void updateUser(UserInfo userInfo) {
        userInfoService.updateUser(userInfo);
    }

      @GetMapping("updateByName")
    public void updateUserByName(String name, UserInfo userInfo) {
          userInfoService.updateUserByName(name,userInfo);
    }
      @GetMapping("delete")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
   }

}
