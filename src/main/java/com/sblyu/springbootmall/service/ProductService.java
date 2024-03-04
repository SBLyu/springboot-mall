package com.sblyu.springbootmall.service;

import com.sblyu.springbootmall.dto.ProductRequest;
import com.sblyu.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
