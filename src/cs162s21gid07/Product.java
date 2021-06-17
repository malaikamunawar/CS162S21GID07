/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

import java.util.*;
/**
 *
 * @author Track Computers
 */
public class Product {
    public String ProName;
    public String ProItem;
    public String price;
    public List vegetable;
       public List Grocery;
          public List madicineList;
    
    Object medicineList;

    Product(String ProName, String proItem, String amount) {
    this.ProName=ProName;
    this.ProItem=proItem;
    this.price=amount;
    
    }

    public List getVegetable() {
        return vegetable;
    }

    public void setVegetable(List vegetable) {
        this.vegetable = vegetable;
    }

    public List getGrocery() {
        return Grocery;
    }

    public void setGrocery(List Grocery) {
        this.Grocery = Grocery;
    }

    public List getMadicineList() {
        return madicineList;
    }

    public void setMadicineList(List madicineList) {
        this.madicineList = madicineList;
    }

    public Product(List vegetable, List Grocery, List madicineList) {
        this.vegetable = vegetable;
        this.Grocery = Grocery;
        this.madicineList = madicineList;
    }
}
