package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.Impl.ProductQueryServiceImpl;
import club.banyuan.service.Impl.ProductShowServiceImpl;
import club.banyuan.service.ProductQueryService;
import club.banyuan.service.ProductShowService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProductShowServlet",urlPatterns = "/show.do")
public class ProductShowServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String flag = request.getParameter("flag");
    ProductShowService productShowService =new ProductShowServiceImpl();
    try {
      List<Product> productList= productShowService.getShowProduct();
      if(productList!=null){
        HttpSession session = request.getSession();
        session.setAttribute("productList",productList);
        if("productShow".equals(flag)){
          request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        if("adminShow".equals(flag)){
          request.getRequestDispatcher("admin.jsp").forward(request,response);
        }
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
