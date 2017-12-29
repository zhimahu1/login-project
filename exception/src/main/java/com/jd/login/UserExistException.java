package com.jd.login;

/**
 * Created by huyanxia on 2017/8/10.
 */
public class UserExistException extends RuntimeException {
    String str;

    public UserExistException(String str) {
        super(str);
        this.str = str;
    }
}
