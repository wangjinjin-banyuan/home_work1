package club.banyuan.service;

import club.banyuan.entity.Product;
import java.util.List;

public interface ProductQueryService {
  public List<Product> getProductByProperty(String p_property) throws Exception;

}
