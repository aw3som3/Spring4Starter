/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author wahyu
 */
@Entity
@Table(name = "test1")
@NamedQueries({
    @NamedQuery(name = "Test1.findAll", query = "SELECT t FROM Test1 t")})
public class Test1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Test1PK test1PK;
    @Size(max = 20)
    @Column(name = "field1")
    private String field1;

    public Test1() {
    }

    public Test1(Test1PK test1PK) {
        this.test1PK = test1PK;
    }

    public Test1(int id1, int id2) {
        this.test1PK = new Test1PK(id1, id2);
    }

    public Test1PK getTest1PK() {
        return test1PK;
    }

    public void setTest1PK(Test1PK test1PK) {
        this.test1PK = test1PK;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (test1PK != null ? test1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test1)) {
            return false;
        }
        Test1 other = (Test1) object;
        if ((this.test1PK == null && other.test1PK != null) || (this.test1PK != null && !this.test1PK.equals(other.test1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.navita.mavenproject4.entity.Test1[ test1PK=" + test1PK + " ]";
    }
    
}
