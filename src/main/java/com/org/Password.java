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

    public int passwordStrength(){

        String value = this.value;
        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;

        int score = 0;

        for(int i = 0; i < value.length(); ++i) {
            char c = value.charAt(i);
            int type = this.charType(c);
            if (type == 1) {
                usedUpper = true;
            }

            if (type == 2) {
                usedLower = true;
            }

            if (type == 3) {
                usedNum = true;
            }

            if (type == 4) {
                usedSym = true;
            }
        }

        if (usedUpper) {
            ++score;
        }

        if (usedLower) {
            ++score;
        }

        if (usedNum) {
            ++score;
        }

        if (usedSym) {
            ++score;
        }

        if (value.length() >= 8) {
            ++score;
        }

        if (value.length() >= 16) {
            ++score;
        }

        return 0;
    }

    public String calculateScore(){

        int Score = this.passwordStrength();
        if (Score == 6) {
            return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
        } else if (Score >= 4) {
            return "This is a good password :) but you can still do better";
        } else {
            return Score >= 3 ? "This is a medium password :/ try making it better" : "This is a weak password :( definitely find a new one";
        }

    }

    @Override
    public String toString() {
        return "Password{" +
                "value='" + value + '\'' +
                ", length=" + length +
                '}';
    }
}
