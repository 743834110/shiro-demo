package xyz.berby.shirodemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.berby.shirodemo.bean.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {

    public UserInfo findByUsername(String name);
}
