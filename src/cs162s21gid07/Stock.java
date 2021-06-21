/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

/**
 *
 * @author Track Computers
 */
public class Stock {
    public int remainingProduct;
    private Date dateOfArrival;
    private static Stock getinstance;
    
     public static Stock getinstance()
    {
        if (getinstance==null) {
               getinstance=new Stock();
 
        }
        return getinstance;
    }
    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }
    public static void LoadData()
    {
    try{
    
    FileReader fr=new FileReader("ListOfAvailibleProduct.txt");
    BufferedReader br=new BufferedReader(fr);
    String Line;
    String allData;
    while((Line=br.readLine())!=null)
    {
        allData=Line;
    }
    br.close();
    fr.close();
    }  
catch (Exception ex)
{
    System.err.println("File Not found");
}
}
}