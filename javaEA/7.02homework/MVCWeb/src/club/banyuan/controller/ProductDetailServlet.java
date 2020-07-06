package club.banyuan.controller;

import club.banyuan.dao.IBaseDao;
import club.banyuan.entity.Product;
import club.banyuan.service.ProductService;
import club.banyuan.service.impl.ProductServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductDetailServlet",urlPatterns = "/productDetail.do")
public class ProductDetailServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    if(request.getParameter("id")!=null){
      int id = Integer.valueOf(request.getParameter("id"));
      ProductService productService=new ProductServiceImpl();
      try {
        Product product = productService.getProductById(id);
        if(product!=null){
          request.getRequestDispatcher("ProductDetail.jsp").forward(request,response);
        }else{
          request.getRequestDispatcher("categoteryList.jsp").forward(request,response);
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
    }else{
      request.getRequestDispatcher("categoteryList.jsp").forward(request,response);
    }




  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
      doPost(request,response);
  }
}
