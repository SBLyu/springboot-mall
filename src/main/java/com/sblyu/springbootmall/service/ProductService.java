package com.sblyu.springbootmall.service;

import com.sblyu.springbootmall.dto.ProductQueryParams;
import com.sblyu.springbootmall.dto.ProductRequest;
import com.sblyu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
