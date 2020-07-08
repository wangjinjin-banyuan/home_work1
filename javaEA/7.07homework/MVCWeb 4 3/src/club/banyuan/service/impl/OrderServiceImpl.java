package club.banyuan.service.impl;

import club.banyuan.dao.OrderDao;
import club.banyuan.dao.impl.OrderDaoImpl;
import club.banyuan.entity.Order;
import club.banyuan.service.OrderService;
import club.banyuan.util.JdbcUtils;

import java.sql.SQLException;

public class OrderServiceImpl implements OrderService {

    @Override
    public int add(Order order) throws Exception {
        OrderDao orderDao =new OrderDaoImpl(JdbcUtils.getConnection());
        return orderDao.add(order);

    }
}
