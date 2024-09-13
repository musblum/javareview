package edu.citytech.javareview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.dto.Stock;
import static edu.citytech.javareview.utility.DataCleanUp.*;


//Author: Abdallah, Salem
public class T1_StockDTO {
    
    
    String html = """
            <table>
                <tr>
                    <td>COLA:CA</td>
                    <td>26.06</td>
                    <td>$416.84B</td>
                    <td>2.64%</td>
                    <td>4, 7, 10, 12</td>
                </tr>
            </table>
                """;


    Document doc = Jsoup.parse(html);
    Elements elements = doc.select("td");



    @Test   
    void t1(){

        Stock stock = new Stock();
        stock.setSymbol(elements.get(0).text());
        var expected = "COLA:CA";
        var actual = stock.getSymbol();
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Test for Price")
    void t2(){
 
        Stock stock = new Stock();
        float price = cleanupPrice.apply(elements.get(1).text());
        stock.setPrice(price);
        var  expected = 26.06f;
        var  actual = stock.getPrice();
        assertEquals(expected, actual);               
    }
    
    @Test
    @DisplayName("Test for Market Cap")
    void t3(){
 
        Stock stock = new Stock();
        float marketCap = cleanupMarketCap.apply(elements.get(2).text());
        stock.setMarketCapInBillions(marketCap);
        var  expected = 416.84f;
        var  actual = stock.getMarketCapInBillions();
        assertEquals(expected, actual);               
    }

}
