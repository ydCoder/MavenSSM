package org.mavenssm.service;

import org.mavenssm.entity.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    int delete(int c_id);
    int  update(Customer customer);
    Customer  findById(int c_id);
    List<Customer> findAll();
    int  findLastId();
}
