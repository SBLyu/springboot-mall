package com.sblyu.springbootmall.dao;

import com.sblyu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}