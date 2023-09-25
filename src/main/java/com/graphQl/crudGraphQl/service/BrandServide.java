package com.graphQl.crudGraphQl.service;

import com.graphQl.crudGraphQl.entity.Brand;
import com.graphQl.crudGraphQl.enums.Country;
import com.graphQl.crudGraphQl.repository.BrandRepo;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BrandServide {
    @Autowired
    BrandRepo brandRepo;
    public List<Brand> findAllBrands(){
    return brandRepo.findAll();
    }
    public Brand findOneBrand(int id){
        return brandRepo.findById(id)
                .orElseThrow(()->new RuntimeException("id no existe"));
    }
    public Brand save(String name, Country country){
        Brand brand = Brand.builder().name(name).country(country).build();
        return brandRepo.save(brand);
    }
    @PostConstruct
    private void loadData(){
        save("Fiat",Country.AR);
        save("Chevrolet",Country.BRA);
        save("VW",Country.COL);
    }
}
