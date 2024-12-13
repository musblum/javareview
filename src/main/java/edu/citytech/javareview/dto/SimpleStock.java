package edu.citytech.javareview.dto;

import com.learning.java.data.annotation.Column;
import edu.learning.datastructure.java17.custom.model.KeyAndValue;

public class SimpleStock  extends KeyAndValue<String,SimpleStock> {

    @Column(index = "1")
    private String symbol;

    @Column(index = "7")
    private float marketCapInBillions;

    @Override
    public String getKey() {
        return this.symbol;
    }

    public float getMarketCapInBillions() {
        return marketCapInBillions;
    }

    @Override
    public SimpleStock getValue() {
        return this;
    }

    @Override
    public KeyAndValue<String, SimpleStock> setValue(SimpleStock value) {
        return super.setValue(value);
    }

    @Override
    public String toString() {
        return "SimpleStock{" +
                "symbol='" + symbol + '\'' +
                ", marketCapInBillions=" + marketCapInBillions +
                '}';
    }
}
