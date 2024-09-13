package edu.citytech.javareview.dao;

import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.citytech.javareview.dto.Stock;
import edu.citytech.javareview.utility.DataCleanUp;
import edu.citytech.javareview.utility.FileUtility;

public class StockDAO {

    public StockDAO(Consumer<Stock> consumer) {

    }

    private  void fileLogic(File file){

        
        try {
            Document  doc = Jsoup.parse(file);
            Elements elements = doc.select("table tr");

            int lineNo = 1;

            Stock stock = null;

            for (var e : elements) {
                if (lineNo > 1) {
                    stock = populateStockDTO(file.getName(), e);
                    System.out.println(stock);
                    System.out.println(e.text());
                    System.out.println(".".repeat(150));
                }else{
                    lineNo++;

                
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private Stock populateStockDTO(String source, Element e ) {
        Elements html = e.select("td");

        String symbol = html.get(0).text();
        float price = DataCleanUp.cleanupPrice.apply(html.get(1).text());
        float marketCapInBillions = DataCleanUp.cleanupMarketCap.apply(html.get(2).text());
        float dividend = DataCleanUp.cleanupPercentage.apply(html.get(3).text());
        String months = DataCleanUp.cleanMonth.apply(html.get(4).text());
        source = DataCleanUp.cleanSource.apply(source);

        return new Stock(symbol, price, marketCapInBillions, dividend, months, source);
    
    }

    void t1(){
        var x = new FileUtility(this::fileLogic);
        x.ls.accept("/Users/salem/Library/Mobile Documents/com~apple~CloudDocs/Documents/3650/cst3650");
        
    }

    public void query() {
        t1();
    }

}
