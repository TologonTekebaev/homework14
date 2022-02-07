package com.company;

public class Main {

    public static void main(String[] args) {

        Class c = new Class(12, "Class", new int[]{121,234,4546,322,234});
        System.out.println(c.getNumber() + " " + c.getWord() + " ");
        c.getMassiv();
    }
}
