package edu.citytech.javareview.dto;

import com.learning.java.data.annotation.Column;

public class REIT implements Comparable<REIT>{

    @Column(index = "0")
    private int rank;

    @Column(index = "1")
    private String symbol;

    @Column(index = "4")
    private float saAnalystRating;

    @Column(index = "6")
    private float marketCap;

    @Column(index = "7")
    private float divYield;

    public REIT() {
    }

    public REIT(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getSaAnalystRating() {
        return saAnalystRating;
    }

    public void setSaAnalystRating(float saAnalystRating) {
        this.saAnalystRating = saAnalystRating;
    }

    public float getMarketCap() {
        return marketCap;
    }

    public float getMarketCapInBillions() {
        return marketCap / 1_000_000_000;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    public float getDivYield() {
        return divYield;
    }

    public void setDivYield(float divYield) {
        this.divYield = divYield;
    }

    public String toStringLong() {
        return "REIT [rank=" + rank + ", symbol=" + symbol + ", saAnalystRating=" + saAnalystRating + ", marketCapInBillions="
                + getMarketCapInBillions() + ", divYield=" + divYield + "]";
    }

    @Override
    public String toString() {
        return "symbol=" + symbol;
    }

    @Override
    public int compareTo(REIT o) {
        return this.symbol.compareTo(o.symbol);
    }



}
