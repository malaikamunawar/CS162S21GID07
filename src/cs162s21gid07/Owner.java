/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

/**
 *
 * @author Track Computers
 */
public class Owner extends Manager {
    private static Owner getinstance=null;
    private Owner() {
    }
    public static Owner getinstance()
    {
        if (getinstance==null) {
               getinstance=new Owner();
 
        }
        return getinstance;
    }
    
     public static  String checkCashDetails()
  {
      return "";
  }
     
      public static  String viewBills()
  {
      return "";
  }
       public static  String ViewList()
  {
      return "";
  }
    
  public static  String viewStock()
  {
      return "";
  }
}
