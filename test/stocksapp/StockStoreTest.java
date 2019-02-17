/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

/**
 *
 * @author brian
 */
public class StockStoreTest {

    public StockStoreTest() {
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
     * Test of fetchAllStocks method, of class StockStore.
     */
    @Test
    public void testFetchAllStocks() {

        System.out.println("getAllStocks");
        StockStore instance = new StockStore();
        List expResult = null;
        List result = instance.getStocks();
        assertNotNull(result);
        
    }

}