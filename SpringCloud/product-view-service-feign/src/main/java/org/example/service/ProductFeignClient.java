package org.example.service;

import org.example.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE" )
public interface ProductFeignClient {

    @GetMapping("/getProduct")
    public List<Product> listProducts();
}
