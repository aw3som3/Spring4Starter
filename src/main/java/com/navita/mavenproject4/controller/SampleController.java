/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author wahyu
 */
@Controller
public class SampleController {
    @RequestMapping("/test")
    public String test(){
        Map<String,Object> data = new HashMap<String,Object>();
        return "test2";
    }
    @RequestMapping("/ada")
    public String test2(){
        Map<String,Object> data = new HashMap<String,Object>();
        return "redirect:/test/";
    }
}
