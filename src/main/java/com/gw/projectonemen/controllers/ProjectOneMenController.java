package com.gw.projectonemen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static java.lang.System.out;

@Controller
public class ProjectOneMenController {

    @RequestMapping("/welcome")
    public String Hello(){
        out.println("Welcome");
        out.println("<html><body>\"Welcome to this brave new world\"</body></html>");
        ModelAndView mv =new ModelAndView();
        mv.setViewName("index.html");
        mv.addObject(new String("I am Here"));
        return "<html><body>index.html</body></html>";
    }
}
