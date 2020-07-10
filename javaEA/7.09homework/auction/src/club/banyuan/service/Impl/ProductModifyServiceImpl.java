package club.banyuan.service.Impl;

import club.banyuan.dao.Impl.ProductModifyDaoImpl;
import club.banyuan.dao.ProductModifyDao;
import club.banyuan.entity.Product;
import club.banyuan.service.ProductModifyService;
import club.banyuan.util.JdbcUtils;
import java.sql.SQLException;

public class ProductModifyServiceImpl implements ProductModifyService {

  @Override
  public int ModifyProduct(Product product) throws SQLException {
    ProductModifyDao productModifyDao =new ProductModifyDaoImpl(JdbcUtils.getConnection());
    return productModifyDao.modifyProduct(product);
  }

  @Override
  public int InsertProduct(Product product) throws SQLException {
    ProductModifyDao productInsertDao = new ProductModifyDaoImpl(JdbcUtils.getConnection());
    return productInsertDao.insertProduct(product);
  }
}
