package com.graphQl.crudGraphQl.repository;

import com.graphQl.crudGraphQl.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepo extends JpaRepository <Model, Integer> {
}
