package club.banyuan.service;

import club.banyuan.entity.Product;

public interface ProductModifyService {
        public int ModifyProduct(Product product) throws Exception;
        public int InsertProduct(Product product) throws Exception;
}
