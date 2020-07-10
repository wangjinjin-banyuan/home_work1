package club.banyuan.service.Impl;

import club.banyuan.dao.AdminQueryDao;
import club.banyuan.dao.Impl.AdminQueryDaoImpl;
import club.banyuan.dao.Impl.ProductQueryDaoImpl;
import club.banyuan.dao.ProductQueryDao;
import club.banyuan.entity.Product;
import club.banyuan.service.AdminQueryService;
import club.banyuan.util.JdbcUtils;
import java.util.List;

public class AdminQueryServiceImpl implements AdminQueryService {

  @Override
  public List<Product> getProductByProperty(String p_property) throws Exception {
    AdminQueryDao adminQueryDao = new AdminQueryDaoImpl(JdbcUtils.getConnection());
    return adminQueryDao.getQueryProduct(p_property);
  }
}
