package com.yoona.springbootee.controller;


import com.yoona.springbootee.entity.User;
import com.yoona.springbootee.service.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServic us;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> userList = us.findAll();
        model.addAttribute("userList",userList);
        return "UserList";
    }
    @RequestMapping("findByid")
    public String findByid(int id, HttpServletRequest req,Model model){
        User user = us.findByid(id);
        model.addAttribute("user",user);
        return "UserUpdate";
    }
    @RequestMapping("add")
    public String add(User user,Model model){
        int count = us.add(user);
        if(count>0){
            return "redirect:/user/findAll";
        }
        return "UserList";
    }
    @RequestMapping("delete")
    public String delete(int id,HttpServletRequest req){
//        String s=req.getParameter("id");
//
//        System.out.println("id======"+s);
        us.datele(id);
        return "redirect:/user/findAll";
    }
    @RequestMapping("update")
    public String update(User user,Model model,HttpServletRequest req){
        int count = us.update(user);
        if(count>0){
            return "redirect:/user/findAll";
        }
//        String sex=req.getParameter("sex");
//        System.out.println(sex);
        return "UserList";
    }
    @RequestMapping("addz")
    public String addz(){

        return "UserAdd";
    }

}
