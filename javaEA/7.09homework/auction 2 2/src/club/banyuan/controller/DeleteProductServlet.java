package club.banyuan.controller;

import club.banyuan.service.Impl.ProductModifyServiceImpl;
import club.banyuan.service.ProductModifyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteProductServlet",urlPatterns = "/delete.do")
public class DeleteProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        ProductModifyService productModifyService =new ProductModifyServiceImpl();
        try {
           int i = productModifyService.DeleteProduct(p_id);
            if(i>0){
                request.getRequestDispatcher("admin.jsp").forward(request,response);
            }else{

                request.getRequestDispatcher("admin.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
