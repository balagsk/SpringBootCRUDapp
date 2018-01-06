package com.developer.SpringMySQL.controllers;

import com.developer.SpringMySQL.models.User;
import com.developer.SpringMySQL.models.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Pukar on 6/25/2017.
 */
@Controller
@RequestMapping("/api")
public class MainController {


    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        //mv.addObject("userlist", userRepo.findAll());
        return mv;
    }


}
