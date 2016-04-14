/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.controller;


import com.navita.mavenproject4.entity.Test1;
import com.navita.mavenproject4.entity.Test1PK;

import com.navita.mavenproject4.repository.TestRepository;
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
    

    private @Autowired TestRepository tr;
    

    @RequestMapping(value = "/rest", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Test1 saveTest(){
        Test1 test = new Test1();
        Test1PK tpk = new Test1PK();
        tpk.setId2(1);
        test.setTest1PK(tpk);
        Test1 afterSave = tr.saveAndFlush(test);
        return afterSave;
    }
}
