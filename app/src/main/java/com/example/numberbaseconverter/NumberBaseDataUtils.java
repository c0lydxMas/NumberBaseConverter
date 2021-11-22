package com.example.numberbaseconverter;

public class NumberBaseDataUtils {

    public static NumberBase[] getNumberBase(){
        NumberBase binary = new NumberBase("Binary");
        NumberBase decimal = new NumberBase("Decimal");
        NumberBase octal = new NumberBase("Octal");
        NumberBase hex = new NumberBase("Hex");

        return new NumberBase[] {binary,decimal,octal, hex};
    }

}
