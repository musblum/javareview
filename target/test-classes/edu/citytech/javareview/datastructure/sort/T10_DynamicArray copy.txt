package edu.citytech.javareview.datastructure.sort;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learning.java.data.repository.ExcelRepository;

import edu.citytech.javareview.datastructure.DynamicArray;
import edu.citytech.javareview.datastructure.SortedDynamicArray;
import edu.citytech.javareview.dto.REIT;
import edu.learning.datastructure.java17.custom.model.KeyAndValue;

public class T10_DynamicArray {

    static ExcelRepository<REIT> repository = null;
    static DynamicArray<REIT> reits = new SortedDynamicArray<>(REIT[]::new );

    @BeforeEach  void beforeEachMethod() {        

        String fileName = "/Users/salem/Documents/3650/REITS.xlsx";
        int sheetNumber = 0, skip = 1;
        repository = new ExcelRepository<REIT>(fileName, sheetNumber, skip);
        repository.findAll(REIT.class, reits::add);
        reits.toString(System.out::println);

    System.out.println("-".repeat(150));
    }       

    @Test
    @DisplayName("(1) DynamicArray")
    void t1() {         
        
        DynamicArray<KeyAndValue<Integer,REIT>> results = new DynamicArray<>(KeyAndValue[]::new);

        var stock = new REIT("SILA");

        final int actual = reits.where(stock, results::add);
        final int expected = reits.size() / 10;
        boolean condition = actual < expected;

        System.out.println(results);
        System.out.println("iteration count: " + actual);
    
        assertTrue(true, () -> "");

        assertTrue(condition, ()  -> {
            String display = "actual:" + actual + " expected:" + expected;
            System.out.println(display);
            return display;
        });
    }   

}
