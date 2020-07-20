package club.banyuan.service.impl;

import club.banyuan.dao.AddressDao;
import club.banyuan.dao.OrderDao;
import club.banyuan.dao.OrderDetailDao;
import club.banyuan.entity.Order;
import club.banyuan.entity.OrderDetail;
import club.banyuan.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private OrderDao orderDao;

  @Autowired
  private OrderDetailDao orderDetailDao;

  @Override
  public List<Order> getOrderbyUserId(int userId) {
    return orderDao.getOrderbyUserId(userId);
  }

  @Override
  public void addOrder(Order order) {
    orderDao.addOrder(order);
  }

  @Override
  public void addOrderDetail(OrderDetail detail) {
    orderDetailDao.addOrderDetail(detail);
  }
}
