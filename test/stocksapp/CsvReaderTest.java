/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brian
 */
public class CsvReaderTest {

    public CsvReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ReadRecords method, of class CsvReader.
     */
    @Test
    public void testReadRecordsEmptyPath() {
       
        CsvReader instance;
        try {
            instance = new CsvReader("");
            List result = instance.ReadRecords();
            assertNotNull(result);
            assertEquals(0, result.size());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CsvReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of ReadRecords method, of class CsvReader.
     */
    @Test
    public void testReadRecords() {

        CsvReader instance;
        try {
            instance = new CsvReader("/Users/brian/Desktop/transaktionsfil-2014.csv");
            

            for(Iterator i = instance.iterator();i.hasNext();){

                System.out.println(i.next());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CsvReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    @Test
    public void testIterator() {
        System.out.println("iterator");
        CsvReader instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}