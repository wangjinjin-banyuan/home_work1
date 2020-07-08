package club.banyuan.controller;

import club.banyuan.entity.Administrator;
import club.banyuan.service.AdminService;
import club.banyuan.service.Impl.AdminServiceImpl;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AdminServlet",urlPatterns = "/adminLogin.do")
public class AdminLoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    String adminName = request.getParameter("adminName");
    String password = request.getParameter("a_password");



//        格式验证

//        调用service处理登录请求
    AdminService adminService = new AdminServiceImpl();
    try {
      Administrator admin = adminService.login(adminName,password);
      if(admin!=null){
        HttpSession session =request.getSession();
        session.setAttribute("admin",admin);
        request.getRequestDispatcher("admin.jsp").forward(request,response);
        return ;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    request.getRequestDispatcher("adminLogin.jsp").forward(request,response);
  }


  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
       doPost(request,response);
  }
}
