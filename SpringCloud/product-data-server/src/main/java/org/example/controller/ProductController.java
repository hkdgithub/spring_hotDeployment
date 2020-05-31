package org.example.controller;

import java.util.List;

import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/getProduct")
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
