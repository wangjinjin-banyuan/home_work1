package club.banyuan.controller;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;
import club.banyuan.util.JdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "RegistServlet", urlPatterns = "/regist.do")
public class RegistServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    User user = new User();
    user.setLoginName(request.getParameter("loginName"));
//    user.setUserName(request.getParameter("userName"));
    user.setPassword(request.getParameter("password"));
//    user.setSex(Integer.valueOf(request.getParameter("sex")));
    user.setEmail(request.getParameter("email"));
    user.setMobile(request.getParameter("mobile"));

    UserService userService = new UserServiceImpl();
    try {
      String password = request.getParameter("password");
      String confirm = request.getParameter("confirm");

      if (password != null && confirm != null && password.equals(confirm)) {
        int id = userService.add(user);
        if (id > 0) {
          request.getRequestDispatcher("index.jsp").forward(request, response);
          System.out.println(id);
        } else {
          request.getRequestDispatcher("index1.jsp").forward(request, response);
        }
      }else {
        request.setAttribute("password",password);
        request.setAttribute("confirm",confirm);
        request.getRequestDispatcher("index1.jsp").forward(request,response);
      }

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}