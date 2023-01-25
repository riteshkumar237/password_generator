package com.org;

import java.util.Scanner;

import static com.org.Generator.keyboard;

public class Main {
    public static void main(String[] args) {

        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }

    static {
        keyboard = new Scanner(System.in);
    }

}