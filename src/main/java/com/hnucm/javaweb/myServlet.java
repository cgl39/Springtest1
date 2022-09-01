package com.hnucm.javaweb;

import com.hnucm.javaweb.dao.UserDao;
import com.hnucm.javaweb.dao.impl.UserDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "myServlet", value = "/myServlet")
public class myServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //servlet 转发jsp页面
        //jsp页面负责html网页相关的 servlet负责请求java逻辑相关的代码
        //todo 从数据库中请求用户名的数据库
        //java JDBC连接数据库 1、打开数据库 2、sql语句请求数据库得到 3、数据处理封装 4、关闭数据库
        //新建一个包 把所有与数据库操作有关的放到这个包下
        //每一个模块需要创建一个接口 + 一个实现类
        UserDao userDao=new UserDaoImpl();
        request.setAttribute("name",userDao.findUser());
        request.getRequestDispatcher("index,jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
