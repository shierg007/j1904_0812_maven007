package com.qf.j1904.impl;

import com.qf.j1904.Food;
import com.qf.j1904.FoodMapper;
import com.qf.j1904.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceimpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> loadAll() {
        return null;
    }

    @Override
    public boolean deleteFood() {
        return false;
    }

    @Override
    public boolean updateFood() {
        return false;
    }

    @Override
    public boolean addFood() {
        return false;
    }
}
