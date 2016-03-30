/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navita.mavenproject4.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author wahyu
 */
@Entity
@Table(name = "s_item")
@NamedQueries({
    @NamedQuery(name = "SItem.findAll", query = "SELECT s FROM SItem s")})
public class SItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seller_id")
    private int sellerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subcategory_id")
    private int subcategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "title")
    private String title;
    @Size(max = 1000)
    @Column(name = "title_en")
    private String titleEn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Size(max = 20)
    @Column(name = "unit_type")
    private String unitType;
    @Size(max = 50)
    @Column(name = "dimension")
    private String dimension;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "min_order")
    private Integer minOrder;
    @Column(name = "bulk_price")
    private Integer bulkPrice;
    @Column(name = "min_bulk_price")
    private Integer minBulkPrice;
    @Column(name = "production_per_month")
    private Integer productionPerMonth;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Lob
    @Size(max = 65535)
    @Column(name = "description_en")
    private String descriptionEn;
    @Size(max = 255)
    @Column(name = "main_image")
    private String mainImage;
    @Size(max = 255)
    @Column(name = "additional_image")
    private String additionalImage;
    @Size(max = 10)
    @Column(name = "is_international")
    private String isInternational;
    @Lob
    @Size(max = 65535)
    @Column(name = "attrib")
    private String attrib;
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public SItem() {
    }

    public SItem(Integer id) {
        this.id = id;
    }

    public SItem(Integer id, int sellerId, int categoryId, int subcategoryId, String title, int price) {
        this.id = id;
        this.sellerId = sellerId;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
        this.title = title;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(Integer minOrder) {
        this.minOrder = minOrder;
    }

    public Integer getBulkPrice() {
        return bulkPrice;
    }

    public void setBulkPrice(Integer bulkPrice) {
        this.bulkPrice = bulkPrice;
    }

    public Integer getMinBulkPrice() {
        return minBulkPrice;
    }

    public void setMinBulkPrice(Integer minBulkPrice) {
        this.minBulkPrice = minBulkPrice;
    }

    public Integer getProductionPerMonth() {
        return productionPerMonth;
    }

    public void setProductionPerMonth(Integer productionPerMonth) {
        this.productionPerMonth = productionPerMonth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getAdditionalImage() {
        return additionalImage;
    }

    public void setAdditionalImage(String additionalImage) {
        this.additionalImage = additionalImage;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    public String getAttrib() {
        return attrib;
    }

    public void setAttrib(String attrib) {
        this.attrib = attrib;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
        if (!(object instanceof SItem)) {
            return false;
        }
        SItem other = (SItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.navita.mavenproject4.entity.SItem[ id=" + id + " ]";
    }
    
}
