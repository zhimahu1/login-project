package com.jd.login.controller;

import com.jd.login.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huyanxia on 2017/8/13.
 */
@WebServlet(name = "LoginServlet" ,value="/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
    Boolean loginSuccess;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //RegisterFormBean bean = WebUtils.request2Bean(request,RegisterFormBean.class);
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserServiceImpl service = new UserServiceImpl();
        loginSuccess = service.loginUser(name,password);
        //通过用户名和密码，没有找到此用户
        if(!loginSuccess){
            String message = String.format( "对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='2;url=%s'",
                    request.getContextPath()+"/servlet/LoginUIServlet");
            request.setAttribute("message",message);
            request.getRequestDispatcher("/WEB-INF/pages/message.jsp").forward(request,response);
            return;
        };
        //request.getSession().setAttribute("user",user);
        String message = String.format("恭喜：%s,登陆成功！本页将在3秒后跳到首页！！<meta http-equiv='refresh' content='3;url=%s'",
                         name, request.getContextPath()+"/index.jsp");
        request.setAttribute("message",message);
        request.getRequestDispatcher("/WEB-INF/pages/message.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
