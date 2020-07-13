package club.banyuan.dao;

import club.banyuan.entity.Product;
import java.util.List;

public interface AdminQueryDao {
  public List<Product> getQueryProduct(String p_property);
}
