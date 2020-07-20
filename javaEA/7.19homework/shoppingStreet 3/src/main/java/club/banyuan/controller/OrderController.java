package club.banyuan.controller;

import club.banyuan.entity.Order;
import club.banyuan.entity.OrderDetail;
import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import club.banyuan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class OrderController {

  @Autowired
  private OrderService orderService;

  @RequestMapping("/creatOrder")
  public String creatOrder(Order order, HttpSession session) {
    if (session.getAttribute("user") == null) {
      return "Login";
    } else {
      User user = (User) session.getAttribute("user");

      double totalPrice = Double.parseDouble(session.getAttribute("totalPrice").toString());
      Map<Product, Integer> car = (Map<Product, Integer>) session.getAttribute("cart");
      orderService.addOrder(order);
      session.removeAttribute("cart");
      session.removeAttribute("totalPrice");
      return "BuyCar3";
    }


  }

}
