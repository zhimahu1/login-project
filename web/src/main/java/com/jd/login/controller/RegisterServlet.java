package com.jd.login.controller;

import com.jd.login.*;
import com.jd.login.formbean.RegisterFormBean;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.SqlDateConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Created by huyanxia on 2017/8/10.
 */
@WebServlet(name = "RegisterServlet",value="/servlet/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    Boolean registerSuccess;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterFormBean formBean = WebUtils.request2Bean(request,RegisterFormBean.class);
        if(!formBean.validate()){//校验失败，则回显同时跳转到register页面
            request.setAttribute("formbean",formBean);
            request.getRequestDispatcher("/WEB-INF/classes/pages/register.jsp").forward(request,response);
            return;
        }
        //校验成功则进行注册
        User user = new User();
        try{
            BeanUtilsBean.getInstance().getConvertUtils().register(new SqlDateConverter(null),Date.class);
            //BeanUtilsBean.getInstance().getConvertUtils().register(new SqlDateConverter(null), java.util.Date.class);
            BeanUtils.copyProperties(user,formBean);
            IUserService userService = new UserServiceImpl();
            registerSuccess = userService.registerUser(user);
            if(!registerSuccess){
                request.setAttribute("message","对不起，注册失败");
                request.getRequestDispatcher("/WEB-INF/classes/pages/message.jsp").forward(request,response);
                return;
            }
            String message = String.format(
                    "注册成功！！3秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='3;url=%s'/>",
                    request.getContextPath()+"/servlet/LoginUIServlet");
            request.setAttribute("message",message);
            request.getRequestDispatcher("/WEB-INF/classes/pages/message.jsp").forward(request,response);//注册成功则跳转到登录页面
        }catch(UserExistException e){//抛出此异常，则说明注册用户已经存在，则回显同时跳转到register页面
            formBean.getErrors().put("name","该用户已存在");
            request.setAttribute("main/com/jd/login/formbean",formBean);
            request.getRequestDispatcher("/WEB-INF/classes/pages/register.jsp").forward(request,response);
        }catch(Exception e){//其他异常，则注册失败，如BeanUtils.copyProperties(user,formBean);的异常
            e.printStackTrace();
            request.setAttribute("message","对不起，注册失败");
            request.getRequestDispatcher("/WEB-INF/classes/pages/message.jsp").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
    }
}
