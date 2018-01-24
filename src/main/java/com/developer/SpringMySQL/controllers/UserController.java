package com.developer.SpringMySQL.controllers;


import com.developer.SpringMySQL.models.User;
import com.developer.SpringMySQL.models.UserRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/api/user")
public class UserController {

    private static Logger logger = LogManager.getLogger();

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/list")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("userlist", userRepo.findAll());
        logger.info("User list rendered successfully");
        return mv;
    }

    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave( @RequestBody User user
           /* @RequestParam(value="firstname",required = true) String firstName,
            @RequestParam(value="lastname",required = true) String lastName,
            @RequestParam(value="appid",required = true) String appid,
            @RequestParam(value="groupid",required = true) String groupid,
            @RequestParam(value="userid",required = true) String userid,
            @RequestParam(value="mobile",required = false) String mobile,
            @RequestParam(value="email",required = false) String email,
            @RequestParam(value="address",required = false) String address,
            @RequestParam(value="dob",required = false) String dob,
            @RequestParam(value="gender",required = false) String gender,
            @RequestParam(value="maritalstatus",required = false) String maritalstatus,
            @RequestParam(value="lastlogin",required = false) String lastlogin,
            @RequestParam(value="password",required = false) String password,
            @RequestParam(value="status",required = false) String status,
            @RequestParam(value="passwdchangedate",required = false) String passwdchangedate,
            @RequestParam(value="modifieddate",required = false) String modifieddate,
            @RequestParam(value="createddate",required = false) String createddate*/
    ){
        System.out.println("User Profile create operation begins here");
        ModelAndView mv = new ModelAndView("home");
       // User user =  new User();

/*        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAppid(appid);
        user.setAppid(groupid);
        user.setAppid(userid);
        user.setMobile(mobile);
        user.setAddress(address);
        user.setEmail(email);
        user.setAddress(address);
        user.setDob(dob);
        user.setGender(gender);
        user.setMaritalstatus(maritalstatus);
        user.setLastlogin(lastlogin);
        user.setPassword(password);
        user.setStatus(status);
        user.setPasswdchangedate(passwdchangedate);
        user.setModifieddate(modifieddate);*/
        user.setCreateddate((new Date()).toString());
        System.out.println(user.toString());
        userRepo.save(user);
        System.out.println("User Profile create operation completed");
        return mv;
    }

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists", userRepo.findOne(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        userRepo.delete(id);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists", userRepo.findOne(id));
        return mv;
    }
}
