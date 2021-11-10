package com.company;

public class Tire extends Car {
    private String tireModel;

    // ---> 필요하면 사용하세요

    // <---

    public void carInfo(){
        //tireModel : 넥센타이어
        this.tireModel = "넥센타이어";
    }

    public void tireModel(){

        System.out.println(this.tireModel +"사용중");
    }
}
