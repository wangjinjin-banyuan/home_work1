package club.banyuan.controller;

import club.banyuan.entity.Product;
import club.banyuan.service.ProductService;
import club.banyuan.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet",urlPatterns = "/search.do")
public class SearchServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String search = request.getParameter("search");
    ProductService productService = new ProductServiceImpl();
    try {
      List<Product> productByName = productService.getProductByName(search);
      System.out.println(productByName.size());
      if (productByName.size() != 0){
        request.getRequestDispatcher("Product.html").forward(request,response);
        }


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
