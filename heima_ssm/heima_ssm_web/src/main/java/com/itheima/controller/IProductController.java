package com.itheima.controller;

import com.itcast.domain.Product;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller//org.springframework.stereotype.Controller
@RequestMapping("/pro")
public class IProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Product> list = productService.findAll();

        mv.addObject("productList", list);
        mv.setViewName("product-list1");
        return mv;
    }
}
