package com.javen.controller;

import com.javen.pojo.User;
import com.javen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
// /user/**
public class UserController {
    //private static Logger log= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public String getUserById(){
       this.userService.getUserById();
       return "index";
    }


}
