package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDao;
import club.banyuan.entity.Order;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao{
    public OrderDaoImpl(Connection connection){
        super(connection);
    }

    @Override
    public int add(Order order) throws Exception {
        String sql = "insert into shoppingstreet.order(id,userId,loginName,userAddress,createTime,cost,serialNumber) values(null,?,?,?,?,?,?)";
        Object[] params = new Object[]{order.getUserId()
                ,order.getLoginName(),order.getUserAddress(),order.getCreateTime(),order.getCost(),order.getSerialNumber()};
        int i= executeInsert(sql,params);
        return i;

    }

    @Override
    public Object tableToClass(ResultSet rs) throws Exception {
        Order order = new Order(rs.getInt(1),
                rs.getInt(2),rs.getString(3),rs.getString(4),
                rs.getDate(5),rs.getFloat(6),rs.getString(7));
        return order;
    }
}
