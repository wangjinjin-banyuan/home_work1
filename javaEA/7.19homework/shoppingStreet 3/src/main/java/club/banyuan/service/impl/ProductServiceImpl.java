package club.banyuan.service.impl;

import club.banyuan.dao.ProductDao;
import club.banyuan.entity.Product;
import club.banyuan.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductDao productDao;

  @Override
  public List<Product> getProductByName(String name)  {
    return productDao.getProductByName(name);
  }

  @Override
  public Product getProductById(Integer id) {
    return productDao.getProductById(id);
  }
}
