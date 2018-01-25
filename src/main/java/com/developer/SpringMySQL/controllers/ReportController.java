package com.developer.SpringMySQL.controllers;


import com.developer.SpringMySQL.models.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/report")
public class ReportController {

    @Autowired
    UserRepo userrepo;

    @RequestMapping("/")
    public ModelAndView getReport(){
     ModelAndView mv = new ModelAndView("/report");
     //mv.addObject()
        return mv;
    }


    @RequestMapping("/user/audit")
    public ModelAndView getUserAuditRpt(){
        ModelAndView mv = new ModelAndView("/userauditrpt");
        mv.addObject("userlist", userrepo.findAll());
        return mv;
    }

}
