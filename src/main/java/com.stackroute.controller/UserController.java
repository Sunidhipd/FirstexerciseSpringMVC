package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/")
    public String greeting(Model m){
        User user=new User();
        user.setName("sunidhi");
        m.addAttribute("user",user.getName());
        return "index";
    }
}
