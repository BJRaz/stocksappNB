/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import org.mockito.Mock;
import java.util.ArrayList;
import java.util.Vector;
import org.mockito.internal.verification.Times;
import java.util.List;
import org.mockito.Mockito;
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
public class ProgramTest {

    @Mock
    StockStore storeMock;

    public ProgramTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        storeMock = Mockito.mock(StockStore.class);
        List list = new ArrayList();
        Mockito.when(storeMock.getStocks()).thenReturn(list);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ListAllStocks method, of class Program.
     */
    @Test
    public void testListAllStocks() {
        
        Program instance = new Program(storeMock);
        instance.ListAllStocks();

        Mockito.verify(storeMock, Mockito.times(1));
    }

}