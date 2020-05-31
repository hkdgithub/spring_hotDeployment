package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProducts(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"该服务端口为:"+port, 50));
        ps.add(new Product(2,"该服务端口为:"+port, 150));
        ps.add(new Product(3,"该服务端口为:"+port, 250));
        return ps;
    }
}
