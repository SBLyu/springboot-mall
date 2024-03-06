package com.sblyu.springbootmall.dao;

import com.sblyu.springbootmall.constant.ProductCategory;
import com.sblyu.springbootmall.dto.ProductRequest;
import com.sblyu.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
