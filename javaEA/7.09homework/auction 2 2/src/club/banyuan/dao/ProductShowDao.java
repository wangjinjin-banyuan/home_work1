package club.banyuan.dao;

import club.banyuan.entity.Product;
import java.util.List;

public interface ProductShowDao extends IBaseDao {
    public List<Product> getShowProduct();
}
