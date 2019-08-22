package com.qf.j1904;


import java.util.List;


public interface FoodMapper {
    public List<Food> loadAll();
    public int deleteFood();
    public int updateFood();
    public int addFood();
}
