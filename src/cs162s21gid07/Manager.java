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
public class Manager extends Person {
    private Date DateOfJoining;
    public int AmtGivenToSupplier;
    public String ThingTakenBySupplier;
    private static Manager getinstance=null;
    
    public Manager(){
    }
     public static Manager getinstance()
    {
       // Object getinstance;
        if (getinstance==null) 
        {
               getinstance=new Manager();
 
        }
        return getinstance;
    }
    
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Date dateOfBirth;
    private double salary;
    
 public Date getDateOfJoining() {
        return DateOfJoining;
    }

    public double getSalary() {
        return salary;
}
    
    
    public static String ViewItems()
    {
        return "hi";
    }
    
     public static Boolean deleteItems()
    {
        return false;
    }
     
      public static Boolean  updateItems()
    {
        return false;
    }
      
       public static Boolean addItems()
    {
        return false;
    }
}
