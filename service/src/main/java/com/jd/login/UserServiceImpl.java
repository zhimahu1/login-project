package com.jd.login;

/**
 * Created by huyanxia on 2017/8/10.
 */
public class UserServiceImpl implements IUserService {
    private UserDaoImpl userDao = new UserDaoImpl();

    public Boolean registerUser(User user) throws UserExistException {
        return userDao.add(user);
    }

    public Boolean loginUser(String name, String pwd) {
        return userDao.find(name, pwd);
    }
}
