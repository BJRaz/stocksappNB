/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.util.Iterator;

/**
 *
 * @author brian
 */
public class Program {
    private final IStockStore store;

    public Program(IStockStore store)
    {
        if(store == null)
            throw new NullPointerException("store");
        this.store = store;
    }

    public void ListAllStocks()
    {
        Iterator<Stock> s = (Iterator<Stock>)store.getStocks().iterator();
        while(s.hasNext()) {

            Stock st = s.next();
            if(st != null)
                System.out.println(st.getCount() + " " + st.getPrice() + " " + st.getDate());
            else
                System.out.println("Null...");
        }

    }
}
