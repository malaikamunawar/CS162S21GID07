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
public class Cashier extends Person{
    public int dailySoldItems;
    
    public List<customer> makeBill()
    {
        List<customer> cList=new ArrayList<customer>();
        return cList;
    }
    
     public static  String ViewList()
  {
      return "";
  }

    public int getDailySoldItems() {
        return dailySoldItems;
    }

    public void setDailySoldItems(int dailySoldItems) {
        this.dailySoldItems = dailySoldItems;
    }
}
