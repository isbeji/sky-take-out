package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    /**
     * 查找购物车中商品
     * @param shoppingCart
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    /**
     * 已有商品数量加1
     * @param shoppingCart
     */
    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     * @param shoppingCart
     */
    @Insert("insert into shopping_cart (name, image, dish_id, setmeal_id, dish_flavor, number, amount, create_time, user_id) " +
            "values (#{name},#{image},#{dishId}, #{setmealId}, #{dishFlavor}, #{number}, #{amount}, #{createTime}, #{userId})")
    void insert(ShoppingCart shoppingCart);

    /**
     * 获取购物车数据
     * @param shoppingCart
     * @return
     */
    @Select("select * from shopping_cart where user_id = #{userId}")
    List<ShoppingCart> showShoppingCart(ShoppingCart shoppingCart);

    /**
     * 删除购物车数据
     * @param  userId
     */
    @Delete("delete from shopping_cart where user_id = #{userId}")
    void deleteShoppingCart(Long userId);

    /**
     * 减少购物车数据
     * @param shoppingCart
     */
    void subShoppingCart(ShoppingCart shoppingCart);

    /**
     * 批量插入购物车数据
     * @param shoppingCartList
     */
    void insertBatch(List<ShoppingCart> shoppingCartList);
}
