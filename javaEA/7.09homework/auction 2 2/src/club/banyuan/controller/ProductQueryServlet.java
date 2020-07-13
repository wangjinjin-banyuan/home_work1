package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.Impl.ProductQueryServiceImpl;
import club.banyuan.service.ProductQueryService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProductQueryServlet",urlPatterns = "/productQuery.do")
public class ProductQueryServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String p_property = request.getParameter("p_name");
    ProductQueryService productQueryService =new ProductQueryServiceImpl();
    try {
      List<Product> productList= productQueryService.getProductByProperty(p_property);
      if(productList!=null){
        HttpSession session = request.getSession();
        session.setAttribute("productList",productList);
        request.getRequestDispatcher("product.jsp").forward(request,response);
      }else {
        request.getRequestDispatcher("index.jsp").forward(request,response);
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
