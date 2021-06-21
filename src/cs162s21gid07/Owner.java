/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Track Computers
 */
public class Owner extends Manager {
    private static Owner getinstance=null;
    Owner() {
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
  public static void SaveData(Manager ma,Stock s)
  {
      try{
      FileWriter fw=new FileWriter("Owner's File.txt");
      fw.write("Welcome to SuperMarket");
      fw.write("Availible things     Purchasing By salesMan      amount given to Salesman");
      for (int i=0;i<4; i++)
      {
          fw.write(s.remainingProduct+"   "+ma.ThingTakenBySupplier+"    "+ma.AmtGivenToSupplier);
      }
      fw.flush();
      fw.close();}
      catch(Exception ex)
      {
          
      }
      
  }
}
