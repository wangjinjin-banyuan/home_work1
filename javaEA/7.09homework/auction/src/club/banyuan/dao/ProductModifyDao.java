package club.banyuan.dao;

import club.banyuan.entity.Product;

public interface ProductModifyDao extends IBaseDao {
    public int modifyProduct(Product product);
    public int insertProduct(Product product);
}
