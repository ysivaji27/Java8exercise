package com.java8.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bicycle {

    private Integer frameSize;
    private String brand;

    public Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }
}