package com.javatechie.reactive.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter @Getter
public class ProductDto {
    private String id;
    private String name;
    private int qty;
    private double price;
}
