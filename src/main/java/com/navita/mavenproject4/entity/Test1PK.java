/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author wahyu
 */
@Embeddable
public class Test1PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id1")
    private int id1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id2")
    private int id2;

    public Test1PK() {
    }

    public Test1PK(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id1;
        hash += (int) id2;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test1PK)) {
            return false;
        }
        Test1PK other = (Test1PK) object;
        if (this.id1 != other.id1) {
            return false;
        }
        if (this.id2 != other.id2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.navita.mavenproject4.entity.Test1PK[ id1=" + id1 + ", id2=" + id2 + " ]";
    }
    
}
