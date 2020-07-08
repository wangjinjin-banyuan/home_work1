package club.banyuan.controller;

import club.banyuan.entity.Order;
import club.banyuan.service.OrderService;
import club.banyuan.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "OrderServlet",urlPatterns = "/order.do")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Order order = new Order();

//       order.setCreateTime(Date.valueOf(request.getParameter("createtime")));
       order.setCost(Float.valueOf(request.getParameter("cost")));
       order.setSerialNumber(request.getParameter("serialNumber"));
        OrderService orderService=new OrderServiceImpl();
        try {
            int i=orderService.add(order);
            if(i>0){
                HttpSession session = request.getSession();
                session.setAttribute("order",order);
                request.getRequestDispatcher("Member_Order.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("buycar.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
