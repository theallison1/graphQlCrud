package com.graphQl.crudGraphQl.repository;

import com.graphQl.crudGraphQl.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Integer> {
}
