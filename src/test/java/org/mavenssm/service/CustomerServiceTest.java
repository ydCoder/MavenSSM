package org.mavenssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mavenssm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class CustomerServiceTest {
    @Autowired
    private  CustomerService customerService;

    @Test
    public void save() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
        int  id=1;
        Customer u=customerService.findById(id);
        u.setC_address("清华");
        u.setC_telephone("18882020596");
        customerService.update(u);
    }

    @Test
    public void findById() throws Exception {
    }
@Test
    public void  findAll(){
    List<Customer> u=customerService.findAll();
    for (Customer c:u) {
        System.out.println(c);

    }

}
}