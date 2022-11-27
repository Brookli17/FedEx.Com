package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Fedex;

@Repository
public interface  FedExRepository extends CrudRepository<Fedex, Integer> {

}
