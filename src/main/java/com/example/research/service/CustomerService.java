package com.example.research.service;

import org.jooq.sources.tables.pojos.Customers;

import java.util.List;

public interface CustomerService {

    public List<Customers> findAll();




    List<Customers> search(String keyword);

}
