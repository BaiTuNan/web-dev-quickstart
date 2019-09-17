package com.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 孙儿子
 * @date 2019.9.17
 * 登录请求响应
 */
@WebServlet(urlPatterns = "/Login.do")
public class LoginServlet extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求代码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取前台表单的用户参数
           String username = req.getParameter("username");
        //通过req请求对象获取session会话对象
        HttpSession session = req.getSession();
        //把用户名存入session对象
        ((HttpSession) session).setAttribute("username",username);
           //跳转之前把用户名存入req对象
        //req.setAttribute("username",username);
           //通过req跳转
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
