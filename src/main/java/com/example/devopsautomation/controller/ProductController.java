package com.example.devopsautomation.controller;

import com.example.devopsautomation.entities.Product;
import com.example.devopsautomation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductRepository pr;

    @GetMapping("/all")
    public List<Product> getProduct(){
        return pr.findAll();
    }
}
