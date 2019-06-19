package com.itheima.dao;

import com.itcast.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select * from product")
    public List<Product> findAll();

}
