package org.mavenssm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mavenssm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
//配置spring和junit整合，junit启动时加载springioc容器,用到的依赖有spring-test junit
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CustomerDaoTest {
    @Resource
    private CustomerDao customerDao;
    @Test
    public void save() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
        Integer c_id=1;
        Customer customer=customerDao.findById(c_id);
        customer.setC_address("北京");
        customerDao.update(customer);

    }

    @Test
    public void findById() throws Exception {
        Integer c_id=1;
        Customer customer=customerDao.findById(c_id);
        System.out.println("test");

        System.out.println(customer.getC_name());

        System.out.println("test");
    }

        @Test
    public  void findAll(){
            List<Customer> u=customerDao.findAll();
         /*   for(类型名 输出的变量名单一的: 要遍历的变量名一般为集合数组)*/
            for(Customer c: u){
                System.out.println(c);
            }
        }

}