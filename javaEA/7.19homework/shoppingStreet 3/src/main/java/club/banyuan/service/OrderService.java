package club.banyuan.service;

import club.banyuan.entity.Order;
import club.banyuan.entity.OrderDetail;
import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import java.util.List;
import java.util.Map;

public interface OrderService {
  List<Order> getOrderbyUserId(int userId);
  public void addOrder(Order order);
  public void addOrderDetail(OrderDetail detail) ;
}
