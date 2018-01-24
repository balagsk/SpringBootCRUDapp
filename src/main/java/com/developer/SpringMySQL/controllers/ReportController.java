package com.developer.SpringMySQL.controllers;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/report")
public class ReportController {



    @RequestMapping("/")
    public ModelAndView getReport(){
     ModelAndView mv = new ModelAndView("/UserAudit");
     //mv.addObject()
        return mv;
    }

}
