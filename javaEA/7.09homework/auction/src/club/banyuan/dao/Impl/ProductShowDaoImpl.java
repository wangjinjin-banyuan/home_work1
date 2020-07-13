package club.banyuan.dao.Impl;

import club.banyuan.dao.ProductShowDao;
import club.banyuan.entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductShowDaoImpl extends BaseDaoImpl implements ProductShowDao {

  public ProductShowDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Product tableToClass(ResultSet rs) throws Exception {
    Product product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),
        rs.getTime(4),rs.getTime(5),rs.getFloat(6),rs.getFloat(7));
    return product;
  }

  @Override
  public List<Product> getShowProduct() {
    List<Product> productList = new ArrayList<>();

    String sql = "select * from product ";

    Product product =null;
    try {
      ResultSet rs = executeQuery1(sql);
      while(rs.next()){
        product = tableToClass(rs);
        productList.add(product);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return productList;

  }
  }

