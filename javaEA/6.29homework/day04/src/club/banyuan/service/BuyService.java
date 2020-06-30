package club.banyuan.service;

import club.banyuan.entity.Order;
import club.banyuan.entity.Product;
import club.banyuan.util.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyService {
    public Order createOrder(int userId,String searchProduct) throws SQLException {
        String searchSql = "select * from product where name like ? or description like ?";

        Connection conn =  JdbcUtils.getConnection("shoppingstreet");
        PreparedStatement pstm = conn.prepareStatement(searchSql);

        pstm.setString(1,"%"+searchProduct+"%");
        pstm.setString(2,"%"+searchProduct+"%");

        ResultSet rs = pstm.executeQuery();
        List<Product> productList = new ArrayList<>();
        while(rs.next()){
            Product product = new Product();
            product.setId(rs.getInt(1));
            product.setName(rs.getString(2));
            product.setDescription(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            product.setStock(rs.getInt(5));
            product.setQuantity(1);

           productList.add(product);
        }

        Order order= new Order();
        order.setUserId(userId);
        double cost = 0;
        for(Product p : productList){
            cost += p.getPrice() * p.getQuantity();
        }
        order.setCost(cost);
        order.setCreateTime(new Date());

        String orderSql = "insert into shoppingstreet.order(id,userid,cost,createTime) values(null,?,?,?)";
        PreparedStatement pstm2 = conn.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
        pstm2.setInt(1,order.getUserId());
        pstm2.setDouble(2,order.getCost());
        pstm2.setDate(3,new java.sql.Date(order.getCreateTime().getTime()));
        int i = pstm2.executeUpdate();

        ResultSet rs2 = pstm2.getGeneratedKeys();
        if(rs2.next()){
            order.setId((int)rs2.getLong(1));
        }

        return order;
    }
}
