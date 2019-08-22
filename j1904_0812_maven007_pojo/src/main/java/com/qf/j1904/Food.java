package com.qf.j1904;

import lombok.Data;

import java.io.Serializable;

@Data
public class Food implements Serializable {
    private Integer foodId;
    private String foodName;
    private Double foodPrice;
}
