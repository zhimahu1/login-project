package com.jd.login.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huyanxia on 2018/1/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public  class CaseInsensitiveString {
    private String s = "publish";

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
    @Test
    public void compare(){
        String str = "Publish";
        CaseInsensitiveString cis = new CaseInsensitiveString("publish");
        System.out.println(str.equals(cis));
        System.out.println(cis.equals(str));
    }
}
