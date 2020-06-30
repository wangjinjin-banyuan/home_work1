package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDetailDao;
import club.banyuan.entity.OrderDetail;
import club.banyuan.entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailDaoImpl extends BaseDaoImpl implements OrderDetailDao {

  public OrderDetailDaoImpl(Connection connection) {
    super(connection);
  }

  public OrderDetail tableToClass(ResultSet rs) throws Exception {
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setId(rs.getInt("id"));
    orderDetail.setOrderId(rs.getInt("orderId"));
    orderDetail.setProductId(rs.getInt("productId"));
    orderDetail.setQuantity(rs.getInt("quantity"));
    orderDetail.setCost(rs.getFloat("cost"));
    return orderDetail;
  }

  public void add(OrderDetail detail) throws SQLException {
    Integer id = 0;
    String sql = " insert into order_detail(orderId,productId,quantity,cost) values(?,?,?,?) ";
    try {
      Object param[] = new
          Object[]{detail.getOrderId(), detail.getProductId(), detail.getQuantity(),
          detail.getCost()};
      id = this.executeInsert(sql, param);
      detail.setId(id);
    } catch (Exception e) {
      this.closeResource();
      e.printStackTrace();
    }
  }
}
