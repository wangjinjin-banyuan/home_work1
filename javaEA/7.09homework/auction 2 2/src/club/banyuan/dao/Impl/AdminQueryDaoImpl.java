package club.banyuan.dao.Impl;

import club.banyuan.dao.AdminQueryDao;
import club.banyuan.entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminQueryDaoImpl extends BaseDaoImpl implements AdminQueryDao {

  public AdminQueryDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public List<Product> getQueryProduct(String p_property) {
    List<Object> paramsList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();

    String sql = "select * from product where p_name=?";

    Product product =null;
    try {
      ResultSet rs = executeQuery(sql,new Object[]{p_property});
      while(rs.next()){
        product = tableToClass(rs);
        productList.add(product);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return productList;
  }

  @Override
  public Product tableToClass(ResultSet rs) throws Exception {
    Product product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),
        rs.getTime(4),rs.getTime(5),rs.getFloat(6),rs.getFloat(7));
    return product;
  }
}
