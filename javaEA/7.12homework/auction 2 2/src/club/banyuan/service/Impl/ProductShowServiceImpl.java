package club.banyuan.service.Impl;

import club.banyuan.dao.Impl.ProductShowDaoImpl;
import club.banyuan.dao.ProductShowDao;
import club.banyuan.entity.Product;
import club.banyuan.service.ProductShowService;
import club.banyuan.util.JdbcUtils;
import java.util.List;

public class ProductShowServiceImpl implements ProductShowService {

  @Override
  public List<Product> getShowProduct() throws Exception {
    ProductShowDao productShowDao=new ProductShowDaoImpl(JdbcUtils.getConnection());
    return productShowDao.getShowProduct();
  }
}
