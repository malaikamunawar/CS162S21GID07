/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

import java.util.*;
import java.util.Iterator;
/**
 *
 * @author Track Computers
 */
public class Product {
    public String ProName;
    public String ProItem;
    public String price;
    public Product vegetable;
    public String sportsItem;
       public List Grocery;
          public List madicineList;
   

    Product(String ProName, String proItem, String amount) {
    this.ProName=ProName;
    this.ProItem=proItem;
    this.price=amount;
    
    }
Stack<Product> prodStack=new Stack<>(); 
Product v=prodStack.push(vegetable);
//prodStack.push(vegetable);
    public Product getVegetable() {
        return vegetable;
    }

    public void setVegetable(Product vegetable) {
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

    public void setMedicineList(List madicineList) {
        this.madicineList = madicineList;
    }

    public Product(Product vegetable, List Grocery, List madicineList,String sportsItem) {
        this.vegetable = vegetable;
        this.Grocery = Grocery;
        this.madicineList = madicineList;
    }
   /*Iterator<Product> itr=prodStack.iterator();
    while(itr.hasNext())
    {
        System.out.print(itr.next()+" ");
    }*/
    }
