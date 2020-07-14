package club.banyuan.dao;

import club.banyuan.entity.Order;
import java.util.List;

public interface OrderDao {
  List<Order> getOrderbyUserId(int userId)throws Exception;
  public void add(Order order);
}
