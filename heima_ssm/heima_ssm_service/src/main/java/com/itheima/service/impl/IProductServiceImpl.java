package com.itheima.service.impl;

import com.itcast.domain.Product;
import com.itheima.dao.ProductDao;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IProductServiceImpl implements IProductService {
    @Autowired
    private ProductDao productDao;


    public List<Product> findAll() {
        List<Product> all = productDao.findAll();
        return all;
    }
}
