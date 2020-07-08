package club.banyuan.service;

import club.banyuan.entity.Order;
import club.banyuan.entity.User;

import java.sql.SQLException;

public interface OrderService {
    public int add(Order order) throws SQLException, Exception;
}
