package xyz.berby.shirodemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.berby.shirodemo.bean.UserInfo;
import xyz.berby.shirodemo.dao.UserInfoDao;
import xyz.berby.shirodemo.service.UserInfoService;


@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    public UserInfo findByUsername(String name) {
        return this.userInfoDao.findByUsername(name);
    }
}
