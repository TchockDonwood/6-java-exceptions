package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() throws NullPointerException {
        String str = null;
        System.out.println(str.substring(0, 2));
    }
}
