package com.jd.login.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by huyanxia on 2018/1/5.
 */
public class TestException {
    static OuchInfo ouchInfo;
    private static final Log log = LogFactory.getLog("exception");
    public static void main(String[] args) {
        try{
            //ouchInfo.getCode();
            throw new Exception("异常");
        }catch(Exception e){
            //e.printStackTrace();
            log.error("出现错误！");
        }
        //System.out.println("faf");
        ouchInfo = new OuchInfo();
        ouchInfo.setCode("faf");
        System.out.println(ouchInfo.getCode());
    }
}
class OuchInfo{
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
