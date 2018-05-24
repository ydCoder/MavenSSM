package org.mavenssm.dao;


import org.mavenssm.entity.Customer;

import java.util.List;

public interface CustomerDao {
    void save(Customer customer);//增加顾客
    int delete(int c_id);//根据id删除顾客
    int update(Customer customer);//更新顾客信息
    Customer findById(int c_id);//根据id查询顾客信息

    List<Customer> findAll();//查询所有用户
    int findLastId();//找到最后一个id值，默认下一个增加的值为id+1

}
