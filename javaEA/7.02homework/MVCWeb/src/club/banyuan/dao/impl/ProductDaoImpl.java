package club.banyuan.dao.impl;

import club.banyuan.dao.ProductDao;
import club.banyuan.entity.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends BaseDaoImpl implements ProductDao {

  @Override
  public Object tableToClass(ResultSet rs) throws Exception {
    Product product = new Product();
    product.setID(rs.getInt("id"));
    product.setNAME(rs.getString("name"));
    product.setDESCRIPTION(rs.getString("description"));
    product.setPRICE(rs.getFloat("price"));
    product.setSTOCK(rs.getInt("stock"));
    product.setCATEGORYLEVEL1ID(rs.getInt("categoryLevel1Id"));
    product.setCATEGORYLEVEL2ID(rs.getInt("categoryLevel2Id"));
    product.setCATEGORYLEVEL3ID(rs.getInt("categoryLevel3Id"));
    product.setFILENAME(rs.getString("fileName"));
    product.setISDELETE(rs.getInt("isDelete"));
    return product;
  }

  public ProductDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public List<Product> getProductByName(String proName) throws Exception {
    List<Object> paramsList = new ArrayList<Object>();
    List<Product> productList = new ArrayList<Product>();
    StringBuffer sql = new StringBuffer(
        " select * from product where name like ? ");
    ResultSet resultSet = null;
    try {
      paramsList.add("%" + proName + "%");
      resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
      while (resultSet.next()) {
        Product product = (Product) this.tableToClass(resultSet);
        productList.add(product);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource(resultSet);
      this.closeResource();
    }
    return productList;
  }

  @Override
  public Product getProductById(Integer id) throws Exception {
    String sql = " select * from product where id = ? ";
    ResultSet resultSet = null;
    Product product = null;
    try {
      Object params[] = new Object[]{id};
      resultSet = this.executeQuery(sql, params);
      while (resultSet.next()) {
        product = (Product) tableToClass(resultSet);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource(resultSet);
      this.closeResource();
      return product;
    }
  }
}

