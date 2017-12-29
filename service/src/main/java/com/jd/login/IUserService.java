package com.jd.login;

/**
 * Created by huyanxia on 2017/8/10.
 */
public interface IUserService {
    Boolean registerUser(User user)throws UserExistException;
    Boolean loginUser(String name, String pwd);
}
