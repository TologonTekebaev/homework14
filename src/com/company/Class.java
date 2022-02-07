package com.company;

public class Class {

    private int number;
    private String word;
    private int[] massiv;

    public Class(){
  }
    public Class(int number, String word, int[] massiv) {
        this.number = number;
        this.word = word;
        this.massiv = massiv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassiv() {
        for (int b : massiv){
            System.out.print(b + " ");
        }
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
}