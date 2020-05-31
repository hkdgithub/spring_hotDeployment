package org.example.service;

import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductFeignClient productFeignClient;

    public List<Product> listProducts(){
        return productFeignClient.listProducts();
    }
}
