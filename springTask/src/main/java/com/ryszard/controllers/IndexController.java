package com.ryszard.controllers;

import com.ryszard.Coords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){
        return "index.jsp";
    }

    @GetMapping(value = "/result")
    public String result(){
        return "result.jsp";
    }

    @PostMapping(value = "/index")
    public ModelAndView coordFromUser(@ModelAttribute("result")Coords coords, ModelAndView modelAndView){
        System.out.println(coords);
        modelAndView.setViewName("forward:result");
        modelAndView.addObject("result",coords);
        return modelAndView;
    }





}
