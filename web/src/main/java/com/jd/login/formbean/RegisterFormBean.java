package com.jd.login.formbean;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huyanxia on 2017/8/10.
 */
public class RegisterFormBean {
    private String name;
    private String password;
    private String confirmPassword;
    private Date birthday;
    private String email;
    Map<String, String> errors = new HashMap<String, String>();

    public boolean validate() {
        boolean isOK = true;
        if (this.name == null || "".equals(this.name.trim())) {
            isOK = false;
            errors.put("name", "用户名不能为空");
        } else {
            if (!this.name.matches("[a-zA-Z]{3,8}")) {
                isOK = false;
                errors.put("name", "用户名必须为3-8位字母");
            }
        }
        if (this.password == null || "".equals(this.password.trim())) {
            isOK = false;
            errors.put("password", "密码不能为空");
        } else {
            if (!this.password.matches("\\d{3,8}")) {
                isOK = false;
                errors.put("password", "密码必须为3-8位数字");
            }
        }
        if (!this.confirmPassword.equals(this.password)) {
            isOK = false;
            errors.put("confirmPassword", "两次输入密码必须一致");
        }
        //生日类型是Date型的，需要格式化为字符串
        //使用SimpleDateFormat进行转换时，“1990-12-32”不会跑出异常
        //SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        //String birthday = simpleDateFormat.format(this.birthday);
        //使用

       /* if(birthday != null){
            DateLocaleConverter dateLocaleConverter = new DateLocaleConverter();
            dateLocaleConverter.convert(this.birthday);
                isOK = false;
                errors.put("birthday","生日必须是一个日期");
        }*/
        //邮箱可以为空，不空的话判断格式
        if (!("".equals(this.email)) && email != null) {
            if (!(this.email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,}$"))) {
                isOK = false;
                errors.put("email", "邮箱格式不正确");
            }
        }
        return isOK;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
