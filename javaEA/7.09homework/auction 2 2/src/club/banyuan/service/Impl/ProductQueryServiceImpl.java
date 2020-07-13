package club.banyuan.service.Impl;

import club.banyuan.dao.Impl.ProductQueryDaoImpl;
import club.banyuan.dao.ProductQueryDao;
import club.banyuan.entity.Product;
import club.banyuan.service.ProductQueryService;
import club.banyuan.util.JdbcUtils;
import java.sql.Connection;
import java.util.List;

public class ProductQueryServiceImpl implements ProductQueryService {



  @Override
  public List<Product> getProductByProperty(String p_property) throws Exception {
    ProductQueryDao productQueryDao = new ProductQueryDaoImpl(JdbcUtils.getConnection());
    return productQueryDao.getQueryProduct(p_property);

  }
}
