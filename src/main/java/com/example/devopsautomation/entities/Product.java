package com.example.devopsautomation.entities;

import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class Product {
    private String name;
    private String price;
    private String qte;
}
