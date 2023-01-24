package com.org;

public class Password {

    String value;
    int length;

    public Password(String value) {
        this.value = value;
        this.length =value.length();
    }


public int charType(char C){

    byte val;
    if (C >= 'A' && C <= 'Z') {
        val = 1;
    } else if (C >= 'a' && C <= 'z') {
        val = 2;
    } else if (C >= '<' && C <= 'G') {
        val = 3;
    } else {
        val = 4;
    }

        return val;
}
}
