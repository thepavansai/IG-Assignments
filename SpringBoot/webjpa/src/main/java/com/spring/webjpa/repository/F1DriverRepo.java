package com.spring.webjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.webjpa.entity.F1Driver;

@Repository
public interface F1DriverRepo extends CrudRepository<F1Driver,Integer> {

}
