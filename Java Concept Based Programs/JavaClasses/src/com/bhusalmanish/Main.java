package com.bhusalmanish;

public class Main {

    public static void main(String[] args){
        Car porsche = new Car();
        Car maruti = new Car();

        porsche.setModel("911");
        System.out.print("model is"+porsche.getModel());
    }
}
