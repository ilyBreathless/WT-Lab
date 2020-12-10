package kh.com.duende.service;

import kh.com.duende.model.Product;

import java.util.List;


public interface ProductService {
    List<Product> getProductList(Integer offset, Integer maxResults);

    Product getProductById(int id);

    Long countProducts();
}
