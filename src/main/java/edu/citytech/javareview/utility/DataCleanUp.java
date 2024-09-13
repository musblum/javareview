package edu.citytech.javareview.utility;

import java.util.function.Function;

public class DataCleanUp {

    public static Function<String, Float> cleanupPrice = e -> {
        String cleanData = e.replaceAll("\\$", "").replaceAll(",", "");
        return Float.parseFloat(cleanData);
    };
    
    public static Function<String, Float> cleanupMarketCap = e -> {
        String cleanData = e.toUpperCase().replaceAll("\\$", "")
        .replaceAll("B", "")
        .replaceAll("T", "")
        .replaceAll("M", "")
        // .replaceAll("%", "")
        .replaceAll(",", "");


        float number = Float.parseFloat(cleanData);

        if (e.contains("T"))
            number = number * 1_000;
        else if (e.contains("M"))
            number = number / 100;
        else if(number > 1_000_000_000)
            number = number / 1_000_000_000;
        
        return number;
    };
    public static Function<String, Float> cleanupPercentage = e ->{
        String cleanData = e.replaceAll("\\%", "")
        .replaceAll("\\$", "")
        .replaceAll(",", ".");
        return Float.parseFloat(cleanData) / 100;
    };

    public static Function<String, String> cleanMonth = e ->{
        String cleanData = e.replaceAll("\\%", "")
        .replaceAll("\\$", "")
        .replaceAll(" ", "")
        .replaceAll("1-12", "1,2,3,4,5,6,7,8,9,10,11,12")
        .replaceAll(",", "|");

        return cleanData;
    };

    public static Function<String, String> cleanSource = e ->{
        String cleanData = e.toLowerCase()
        .replaceAll("-", "")
        .replaceAll("_", " ")
        .replaceAll(".html", "")
        .replaceAll("cst3650", "");
        return cleanData;
    };
}