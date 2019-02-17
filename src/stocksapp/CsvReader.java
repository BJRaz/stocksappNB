/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brian
 */
public class CsvReader implements Iterable {
    private final String path;
    public BufferedReader reader;

    public CsvReader(String path) throws FileNotFoundException{
        this.path = path;
        reader = new BufferedReader(new FileReader(path));
    }

    public List ReadRecords(){
        List list = new ArrayList<String[]>();
        try {
            String line = "";
             

                while ((line = reader.readLine()) != null) {
                    list.add(line.split(";"));
                }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException io){
            Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, io);

        }        

        return list;
    }

    public Iterator iterator() {
        return new CsvIterator(this);
    }

    class CsvIterator implements Iterator {
        private final CsvReader _reader;
        private String record = "";

        CsvIterator(CsvReader reader) {
            this._reader = reader;
        }

        public boolean hasNext() {

            try {
                record = _reader.reader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
            }
            return record != null;
        }

        public Object next() {
            return (record.split(";"));
        }

        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
