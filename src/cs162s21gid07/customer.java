/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs162s21gid07;

import java.util.Date;

/**
 *
 * @author Track Computers
 */
public class customer {
    private Date dateOfPurchasing;
    private int totalPurchasing;
    
    private Boolean payCash()
    {
        return false;
    }
    
    public Boolean returnThing()
    {
        return false;
    }

    public Date getDateOfPurchasing() {
        return dateOfPurchasing;
    }

    public void setDateOfPurchasing(Date dateOfPurchasing) {
        this.dateOfPurchasing = dateOfPurchasing;
    }

    public int getTotalPurchasing() {
        return totalPurchasing;
    }

    public void setTotalPurchasing(int totalPurchasing) {
        this.totalPurchasing = totalPurchasing;
    }
}
