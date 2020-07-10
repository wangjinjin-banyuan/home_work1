package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.Impl.ProductModifyServiceImpl;
import club.banyuan.service.ProductModifyService;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ModifyProductServlet",urlPatterns = "")
public class ModifyProductServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    Product product =new Product();
    product.setP_id(Integer.valueOf(request.getParameter("p_id")));
    product.setP_name(request.getParameter("p_name"));
    product.setP_startTime(Date.valueOf(request.getParameter("p_startTime")));
    product.setP_endTime(Date.valueOf(request.getParameter("p_endTime")));
    product.setStartingPrice(Float.valueOf(request.getParameter("startingPrice")));
    product.setFloorPrice(Float.valueOf(request.getParameter("floorPrice")));
    ProductModifyService productModifyService = new ProductModifyServiceImpl();
    try {
      int i= productModifyService.ModifyProduct(product);
      if(i>0){
        request.getRequestDispatcher("admin.jsp").forward(request,response);
      }else{
        request.getRequestDispatcher("modifyProduct.jsp").forward(request,response);
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
