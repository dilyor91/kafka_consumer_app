package com.example.kafka_consuper_app.model;

import lombok.Data;

@Data
public class Order {
    private String id;
    private Double price;
    private String email;
}
