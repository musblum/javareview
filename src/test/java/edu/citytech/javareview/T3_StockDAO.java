package edu.citytech.javareview;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import edu.citytech.javareview.dao.StockDAO;
import edu.citytech.javareview.dto.Stock;

public class T3_StockDAO {

    //Developer: Abdallah, Salem
    @Test
    void t1(){
        Consumer<Stock> consumer = System.out::println;
        var dao = new StockDAO(consumer);
        dao.query();
        System.out.println("Abdallah, salem " + new java.util.Date());
    }

}
 