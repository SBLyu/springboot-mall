package com.sblyu.springbootmall.dao;

import com.sblyu.springbootmall.dto.ProductRequest;
import com.sblyu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
