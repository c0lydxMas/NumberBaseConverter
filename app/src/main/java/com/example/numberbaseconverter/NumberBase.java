package com.example.numberbaseconverter;

public class NumberBase {

    private String numberBase;

    public NumberBase(String numberBase){
        this.numberBase = numberBase;
    }

    public String getNumberBase() {
        return numberBase;
    }

    public void setNumberBase(String numberBase) {
        this.numberBase = numberBase;
    }

    // Text show in Spinner
    @Override
    public String toString()  {
        return this.getNumberBase();
    }
}
