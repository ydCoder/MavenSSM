package org.mavenssm.controller;

import org.mavenssm.entity.Customer;
import org.mavenssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    /**
     * 注入service层
     */
    @Autowired
    private CustomerService customerService;

    /**
     * 跳转到所有用户的页面
     */

@RequestMapping(value = "/toListPage")
    public   String   listAll(Model model){
    //获得所有顾客集合
    List<Customer> customersList=customerService.findAll();
    //将顾客添加到model中
    model.addAttribute("customersList",customersList);
    return "back/list";

}

    /**
     * 点击页面跳转到添加客户功能页面
     */
    @RequestMapping("/toSavePage")
    public String toSavePage(Model model) {
        // 先去后台查询数据库中最后一个主键值，默认设置下一个主键值是新插入数据的id+1
        int id = customerService.findLastId();
        System.out.println("后台查询到的id值：" + id);
        // 将查询到的值设置到Model中 
        model.addAttribute("newId", id + 1);

        return "back/save";
    }
@RequestMapping(value="/save")
    public  String save(Customer customer, Model model){
        customerService.save(customer);
         System.out.println("test");
        model.addAttribute("message", "保存客户信息成功");
        return "back/info";

    }
    @RequestMapping(value="/findById")
    @ResponseBody
    public Customer findById(@RequestParam("c_id") int c_id){
        System.out.println("hahahahahha");
      Customer customer= customerService.findById(c_id);
      return customer;
    }

}
