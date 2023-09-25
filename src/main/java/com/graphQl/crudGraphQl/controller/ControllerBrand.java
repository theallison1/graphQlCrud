package com.graphQl.crudGraphQl.controller;

import com.graphQl.crudGraphQl.entity.Brand;
import com.graphQl.crudGraphQl.service.BrandServide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ControllerBrand {
    @Autowired
    BrandServide brandServide;

    @QueryMapping
    public List<Brand> findAllBrands() {
        return brandServide.findAllBrands();
    }

    @QueryMapping
    public Brand findOnaBrand(@Argument int id){
        return      brandServide.findOneBrand(id);
    }
}
