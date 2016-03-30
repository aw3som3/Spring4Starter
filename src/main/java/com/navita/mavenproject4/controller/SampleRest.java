/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.controller;

import com.navita.mavenproject4.entity.SUser;
import com.navita.mavenproject4.repository.SUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wahyu
 */
@RestController
public class SampleRest {
    
    private @Autowired SUserRepository su;
    
    @RequestMapping(value = "/rest1", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody SUser getAllUser(){
        return su.findOne(1);
    }
}
