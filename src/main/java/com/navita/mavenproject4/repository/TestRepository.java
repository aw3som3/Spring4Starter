/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.repository;

import com.navita.mavenproject4.entity.Test1;
import com.navita.mavenproject4.entity.Test1PK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wahyu
 */
public interface TestRepository extends JpaRepository<Test1,Test1PK> {
    
}
