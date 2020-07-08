package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.Impl.UserServiceImpl;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("u_password");
        String autoLogin = request.getParameter("autoLogin");
        if(autoLogin!=null){
            Cookie cookieUserName =new Cookie("loginName",loginName);
            cookieUserName.setMaxAge(24*60*60);
            response.addCookie(cookieUserName);

            Cookie cookieUserPassword =new Cookie("u_password",password);
            cookieUserPassword.setMaxAge(24*60*60);
            response.addCookie(cookieUserPassword);
        }

//        格式验证

//        调用service处理登录请求
        UserService userService = new UserServiceImpl();
        try {
            User user = userService.login(loginName,password);
            if(user!=null){
                HttpSession session =request.getSession();
                session.setAttribute("user",user);
                request.getRequestDispatcher("product.jsp").forward(request,response);
                return ;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.getRequestDispatcher("Login.html").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
