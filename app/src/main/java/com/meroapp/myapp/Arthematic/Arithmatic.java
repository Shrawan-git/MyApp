package com.meroapp.myapp.Arthematic;

public class Arithmatic {
    private int first;
    private int second;

    //to add two numbers
    public int add(){
        return first + second;
    }

    //to substract two numbers
    public int sub(){
        return first - second;
    }

    public Arithmatic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
