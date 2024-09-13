package edu.citytech.javareview;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.utility.FileUtility;

public class T2_FileUtility {


    public static void fileLogic(File file){

        
        try {
            Document  doc = Jsoup.parse(file);
            Elements elements = doc.select("table tr");

            int lineNo = 1;



            for (var e : elements) {
                if (lineNo > 1) {
                    System.out.println(((Element) e).text());
                }else{
                    lineNo++;
                }
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    void t1(){
        var x = new FileUtility(T2_FileUtility::fileLogic);
        x.ls.accept("/Users/salem/Library/Mobile Documents/com~apple~CloudDocs/Documents/3650/cst3650");
        
    }


}
