/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author wahyu
 */
@Entity
@Table(name = "s_order")
@NamedQueries({
    @NamedQuery(name = "SOrder.findAll", query = "SELECT s FROM SOrder s")})
public class SOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_id")
    private int itemId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seller_id")
    private int sellerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "buyer_id")
    private int buyerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_paid")
    private short isPaid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "confirmation_image")
    private String confirmationImage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_confirmed")
    private short isConfirmed;

    public SOrder() {
    }

    public SOrder(Integer id) {
        this.id = id;
    }

    public SOrder(Integer id, int itemId, int sellerId, int buyerId, int quantity, float price, short isPaid, String confirmationImage, short isConfirmed) {
        this.id = id;
        this.itemId = itemId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.quantity = quantity;
        this.price = price;
        this.isPaid = isPaid;
        this.confirmationImage = confirmationImage;
        this.isConfirmed = isConfirmed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(short isPaid) {
        this.isPaid = isPaid;
    }

    public String getConfirmationImage() {
        return confirmationImage;
    }

    public void setConfirmationImage(String confirmationImage) {
        this.confirmationImage = confirmationImage;
    }

    public short getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(short isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SOrder)) {
            return false;
        }
        SOrder other = (SOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.navita.mavenproject4.entity.SOrder[ id=" + id + " ]";
    }
    
}
