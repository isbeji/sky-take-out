package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品，同时保存对应的口味数据
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 批量删除菜品
     */
    void deleteBatch(List<Long> ids);
}
