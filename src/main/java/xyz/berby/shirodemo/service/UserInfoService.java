package xyz.berby.shirodemo.service;

import xyz.berby.shirodemo.bean.UserInfo;

public interface UserInfoService {

    public UserInfo findByUsername(String name);
}
