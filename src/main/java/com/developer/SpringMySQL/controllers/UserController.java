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

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/list")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("userlist", userRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName){
        ModelAndView mv = new ModelAndView("redirect:/");
        User users;
        if(!id.isEmpty()){
            users =(User) userRepo.findOne(Integer.parseInt(id));
        } else {
            users = new User();
        }
        users.setFirstName(firstName);
        users.setLastName(lastName);
        userRepo.save(users);
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
