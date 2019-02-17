/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.util.Date;

/**
 *
 * @author brian
 */
public class Stock {
   private double price;
    private int count;
    private Date date;

   public void setPrice(double price) { this.price = price; }
   public double getPrice() { return this.price; }

   public void setCount(int count) { this.count = count; }
   public int getCount() {return this.count; }

   // date
   public void setDate(Date date) { this.date = date; }
   public Date getDate() { return date; }



}
