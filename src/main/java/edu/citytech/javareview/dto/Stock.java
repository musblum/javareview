package edu.citytech.javareview.dto;

public class Stock {


    private String symbol;
    private float price;
    private float marketCapInBillions;
    private float dividend;
    private String months;
    private String source;

    

    public Stock(){
        
    }
    
    public Stock(String symbol, float price, float marketCapInBillions, float dividend, String months, String source) {
        this.symbol = symbol;
        this.price = price;
        this.marketCapInBillions = marketCapInBillions;
        this.dividend = dividend;
        this.months = months;
        this.source = source;
    }

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getMarketCapInBillions() {
        return marketCapInBillions;
    }
    public void setMarketCapInBillions(float marketCapInBillions) {
        this.marketCapInBillions = marketCapInBillions;
    }
    public float getDividend() {
        return dividend;
    }
    public void setDividend(float dividend) {
        this.dividend = dividend;
    }
    public String getMonths() {
        return months;
    }
    public void setMonths(String months) {
        this.months = months;
    }
    @Override
    public String toString() {
        return "Stock [symbol=" + symbol + ", price=" + price + ", marketCapInBillions=" + marketCapInBillions
                + ", dividend=" + dividend + ", months=" + months + ", source=" + source +  "]";
    }



}
