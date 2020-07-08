package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

//        格式验证

//        调用service处理登录请求
        UserService userService = new UserServiceImpl();
        HttpSession session = request.getSession();
        try {
            User user = userService.login(loginName, password);
            if (user != null) {
                if (remember != null) {
//把用户名和密码存储到cookie里，下次可以直接登录
                    Cookie cookie = new Cookie("loginName", loginName);
                    cookie.setMaxAge(24 * 60 * 60); // 设置过期时间1天，以秒为单位
                    response.addCookie(cookie);// 保存cookie到客户端

                }

                session.setAttribute("user", user);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doPost(request, response);
    }
}
