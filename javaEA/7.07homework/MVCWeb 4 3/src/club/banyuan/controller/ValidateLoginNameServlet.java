package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "ValidateLoginNameServlet",urlPatterns = "/Validate.do")
public class ValidateLoginNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String result ="true";
            String loginName=request.getParameter("loginName");
            if(loginName!=""&&loginName!=null){
                UserService userService = new UserServiceImpl();
                try {
                    User user = userService.getRegisterUser(loginName);
                    if(user!=null){
                        result="false";
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        PrintWriter writer =response.getWriter();
            writer.print(result);
            writer.flush();
            writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
