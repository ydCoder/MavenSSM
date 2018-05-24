package org.mavenssm.service.impl;

import org.mavenssm.dao.CustomerDao;
import org.mavenssm.entity.Customer;
import org.mavenssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);

    }

    @Override
    public int delete(int c_id) {
        return customerDao.delete(c_id);
    }

    @Override
    public int update(Customer customer) {
        return customerDao.update(customer);
    }

    @Override
    public Customer findById(int c_id) {
        return customerDao.findById(c_id);
    }
    @Override
   public List<Customer> findAll(){
        return  customerDao.findAll();
    }

    @Override
    public int findLastId() {
        return customerDao.findLastId();
    }
}
