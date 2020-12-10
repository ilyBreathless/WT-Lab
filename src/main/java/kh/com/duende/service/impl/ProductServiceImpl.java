package kh.com.duende.service.impl;

import kh.com.duende.dao.ProductDao;
import kh.com.duende.model.Product;
import kh.com.duende.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList(Integer offset, Integer maxResults) {
        return productDao.getProductList(offset, maxResults) ;
    }

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }



    @Override
    public Long countProducts() {
        return productDao.countProducts();
    }
}
