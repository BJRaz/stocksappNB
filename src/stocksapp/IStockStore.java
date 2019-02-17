/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stocksapp;

import java.util.List;

/**
 *
 * @author brian
 */
public interface IStockStore<E> {
    List<E> getStocks();
}
