package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.AdminQueryService;
import club.banyuan.service.Impl.AdminQueryServiceImpl;
import club.banyuan.service.Impl.ProductModifyServiceImpl;
import club.banyuan.service.Impl.ProductQueryServiceImpl;
import club.banyuan.service.ProductModifyService;
import club.banyuan.service.ProductQueryService;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminQueryServlet",urlPatterns = "")
public class AdminQueryServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
      String p_property = request.getParameter("p_name");
      AdminQueryService adminQueryService =new AdminQueryServiceImpl();
      try {
          List<Product> productList= adminQueryService.getProductByProperty(p_property);
          if(productList!=null){
              // request.getRequestDispatcher(".jsp").forward(request,response);
          }else {
              request.getRequestDispatcher("admin.jsp").forward(request,response);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
      doPost(request,response);
  }
}
