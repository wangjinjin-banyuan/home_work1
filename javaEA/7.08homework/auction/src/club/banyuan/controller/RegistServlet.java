package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.Impl.UserServiceImpl;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistServlet", urlPatterns = "/regist.do")
public class RegistServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    User user = new User();
    user.setLoginName(request.getParameter("loginName"));
    user.setPassword(request.getParameter("u_password"));

    user.setIdentityCode(request.getParameter("identityCode"));
    user.setMobile(request.getParameter("mobile"));
    user.setAddress(request.getParameter("address"));
    user.setPostcode(request.getParameter("postcode"));

    UserService userService = new UserServiceImpl();
    try {

        int id = userService.add(user);
        if (id > 0) {
          request.getRequestDispatcher("userLogin.jsp").forward(request, response);
          System.out.println(id);
        } else {
          request.getRequestDispatcher("userRegist.jsp").forward(request, response);
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