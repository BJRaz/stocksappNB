/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brian
 */
public class StockStore implements IStockStore {
    private Iterable reader;

    StockStore() {
        try {
            reader = new CsvReader("/Users/brian/Desktop/transaktionsfil-2014.csv");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List getStocks() {
        List list = new ArrayList<Stock>();

        for(Iterator i = reader.iterator();i.hasNext();)
        {
            String[] record = (String[]) i.next();
            Stock s = new Stock();
           // s.setCount(record[8]);
            try {
                s.setDate(new SimpleDateFormat().parse(record[1]));
            } catch (ParseException ex) {
                Logger.getLogger(StockStore.class.getName()).log(Level.SEVERE, null, ex);
            }
            //s.setPrice(record[9]);
        }
        return list;

    }

}
