package com.sblyu.springbootmall.dto;

import com.sblyu.springbootmall.constant.ProductCategory;

public class ProductQueryParams {

    private ProductCategory category;
    private String search;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
