package com.jd.login;

/**
 * Created by huyanxia on 2017/8/10.
 */
public interface IUserDao {
    Boolean find(String name);
    Boolean find(String name, String pwd);
    Boolean add(User user);
}
