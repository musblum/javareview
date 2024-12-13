package edu.citytech.javareview.dto;

import edu.learning.datastructure.java17.custom.model.KeyAndValue;

public class ABC extends KeyAndValue<String, ABC> {

    private final String letter;
    private final String description;
    
    public ABC(String letter, String description) {
        this.letter = letter;
        this.description = description;
    }

    public String getLetter() {
        return letter;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String getKey() {
        return letter;
    }

    @Override
    public ABC getValue() {
        return this;
    }

    @Override
    public String toString() {
        return "ABC [letter=" + letter + ", description=" + description + "]";
    }

}
