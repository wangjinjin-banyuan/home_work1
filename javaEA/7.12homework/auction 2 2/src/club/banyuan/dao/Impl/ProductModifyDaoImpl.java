package club.banyuan.dao.Impl;

import club.banyuan.dao.ProductModifyDao;
import club.banyuan.entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Objects;

public class ProductModifyDaoImpl extends BaseDaoImpl implements ProductModifyDao {

  public ProductModifyDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public Object tableToClass(ResultSet rs) throws Exception {

    return null;
  }

  @Override
  public int modifyProduct(Product product) {
    String sql= "update product set p_name=？,p_describle=？,p_startTime=？,p_endTime=？,p_startingPrice=?,p_floorPrice=? where p_id=?";
    Object[] params = new Object[]{product.getP_name()
        ,product.getP_describle(),product.getP_startTime(),product.getP_endTime(),product.getStartingPrice(),product.getFloorPrice(),product.getP_id()};
    int i= executeUpdate(sql,params);

    return i;
  }

  @Override
  public int insertProduct(Product product) {
    String sql ="insert into product * values (null,?,?,?,?,?,?)";
    Object[] params = new Object[]{product.getP_name()
        ,product.getP_describle(),product.getP_startTime(),product.getP_endTime(),product.getStartingPrice(),product.getFloorPrice()};
    int i= executeUpdate(sql,params);

    return i;
  }

  @Override
  public int deleteProduct(Integer p_id) {
    String sql = "delete from product where p_id=?";
    Object[] params =new Object[]{p_id};
    int i = executeUpdate(sql,params);
    return i;
  }
}
