package com.jd.login.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by huyanxia on 2018/4/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestThread {
    @Test
    public  void testLockSupport() throws Exception
    {
        /*Thread thread = Thread.currentThread();

        LockSupport.unpark(thread);

        System.out.println("a");
        LockSupport.park();
        System.out.println("b");
        LockSupport.park();
        System.out.println("c");
        //LockSupport.unpark(thread);*/


        Thread thread = Thread.currentThread();
        LockSupport.park();// 获取许可
        LockSupport.unpark(thread);//释放许可

        System.out.println("b");

    }
}
