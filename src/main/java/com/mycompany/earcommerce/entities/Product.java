
package com.mycompany.earcommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    private String pName;
    private String pDesc;
    private String pPhoto;
    private int pPrice;
    private int pDiscount;
    private int pQunatity;

    //many to one mapping
    @ManyToOne
    private Category category;
    
    
    public Product(String pName, String pDesc, String pPhoto, int pPrice, int pDiscount, int pQunatity,Category category) {
        this.pName = pName;
        this.pDesc = pDesc;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQunatity = pQunatity;
        this.category=category;
        
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(int pId, String pName, String pDesc, String pPhoto, int pPrice, int pDiscount, int pQunatity) {
        this.pId = pId;
        this.pName = pName;
        this.pDesc = pDesc;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQunatity = pQunatity;
    }

    public Product() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getpPhoto() {
        return pPhoto;
    }

    public void setpPhoto(String pPhoto) {
        this.pPhoto = pPhoto;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public int getpDiscount() {
        return pDiscount;
    }

    public void setpDiscount(int pDiscount) {
        this.pDiscount = pDiscount;
    }

    public int getpQunatity() {
        return pQunatity;
    }

    public void setpQunatity(int pQunatity) {
        this.pQunatity = pQunatity;
    }

    @Override
    public String toString() {
        return "Product{" + "pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice=" + pPrice + ", pDiscount=" + pDiscount + ", pQunatity=" + pQunatity + '}';
    }
    
    
}
