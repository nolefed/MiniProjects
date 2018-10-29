package com.bhusalmanish;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private int color;

    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("commodre")) {
            this.model = model;
        }else{
            this.model="unknown";
        }
     }

    public String getModel(){
        return this.model;
    }


}
