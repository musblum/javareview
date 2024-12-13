package edu.citytech.javareview.datastructure.dictionary;

import com.learning.java.data.repository.ExcelRepository;
import edu.citytech.javareview.dto.SimpleStock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Developer: Boulet, Jean
public class T3_DictionaryStock {

    Dictionary<String, SimpleStock> dictionary = new Dictionary<>(25);

    static ExcelRepository<SimpleStock> repository = null;


    @BeforeEach  void beforeEachMethod() {
        String fileName = "/Users/salem/Documents/3650/excel/SimpleStock.xlsx";
        int sheetNumber = 0, skip = 1;
        repository = new ExcelRepository<SimpleStock>(fileName, sheetNumber, skip);

        repository.findAll(SimpleStock.class, dictionary::put);
    }
    @Test
    public void t1() {

        System.out.println(dictionary.get("VTR"));
        var optional = dictionary.get("VTR");
        SimpleStock stock = optional.orElseGet(SimpleStock::new);
        var expected = 27.03f;
        var actual = stock.getMarketCapInBillions();


        dictionary.debug((i,e) -> {
            System.out.println("key: " + i + ", value: " + e);
        });

        assertEquals(expected, actual ,.01f);
         System.out.println("developer: boulet, jean");
    }

}