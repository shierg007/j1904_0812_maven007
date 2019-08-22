package com.qf.j1904;

import java.util.List;

public interface FoodService {
    public List<Food> loadAll();
    public boolean deleteFood();
    public boolean updateFood();
    public boolean addFood();
}
