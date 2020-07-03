package club.banyuan.servlet;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.util.JdbcUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    //User user = new User();
    //user.setLoginName(request.getParameter("loginName"));
//    user.setUserName(request.getParameter("userName"));
    //user.setPassword(request.getParameter("password"));
//    user.setSex(Integer.valueOf(request.getParameter("sex")));
//    user.setEmail(request.getParameter("email"));
//    user.setMobile(request.getParameter("mobile"));
    boolean flag = false;
    String loginName =request.getParameter("loginName");
    String password =request.getParameter("password");

    try {
      UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
      User user = userDao.getLoginUser(loginName,password);
      if(user!=null){
        //response.sendRedirect("Success.html");
        //response.sendRedirect("index.jsp");
        request.getRequestDispatcher("index.jsp").forward(request,response);
      }else{
        //response.sendRedirect("Faile.html");
      }

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }



//    response.setCharacterEncoding("utf-8");
//    PrintWriter writer = response.getWriter();
//    writer.println("<html>");
//    writer.println("<meta charset='utf-8'/>");
//    writer.println("<body>");
//    writer.println(flag==true?"登陆成功":"登陆失败");
//    writer.println("</body>");
//    writer.println("</html>");
//    writer.flush();
//    writer.close();
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
       doPost(request,response);
  }
}
