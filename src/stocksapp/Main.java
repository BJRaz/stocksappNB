/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

/**
 *
 * @author brian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Program p = new Program(new StockStore());
        p.ListAllStocks();
    }

}
