package org.mavenssm.controller;

import org.mavenssm.entity.Admin;
import org.mavenssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user")
@SessionAttributes("admin")//使用注解将值传到session之中
public class AdminController {

    //注入service

    /**
     * 用户登录
     */
    @Autowired

    @Qualifier("adminService")
    private AdminService userService;
    @RequestMapping("/login")
    //@RequestParam("username")是获取前端name=username的元素里的值，如果使用注解则参数名必须
    //前端名字一致
    public String  login(@RequestParam("username") String name, String password, Model model){
        Admin admin=userService.CheckLogin(name,password);
        if(admin!=null){
            model.addAttribute("admin",admin);
            //登录成功
            return "back/page";
        }
        model.addAttribute("message","登录失败");
        return "back/loginInfo";

    }
    /*@RequestMapping(value="/login",method= RequestMethod.POST)*/
    /*public String login(User user,Model model) throws Exception {
        user=userService.checkLogin(user.getUsername(), user.getPassword());
        if(user!=null){
            model.addAttribute(user);
            //登录成功
            return "page/page";
        }
        model.addAttribute("message","登录失败");
        return "page/loginInfo";
    }
*/
    /**
     * 回到登录页
     */
  /*  @RequestMapping(value="/index")
    public String index(){
        return "../index";
        }*/

}