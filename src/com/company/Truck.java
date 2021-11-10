package com.company;

public class Truck extends Tire {

    private static int item;


    // ---> 필요하면 사용하세요

    // <---

    public static void putItem(int item){
        /*
        물건 10개 상차!!
        주행 속도5
         */
        item = 10;
        System.out.println("물건" + item + "개 상차!!!");
        System.out.println("주행 속도 5");

    }
    public static void pullItem(int item){
        /*
        물건 10개 하차
        물건 4개 남았습니다.
        주행 속도5
         */
        System.out.println("물건"+ item +"개 하차");
        System.out.println("물건 4개 남았습니다.");
        System.out.println("주행 속도 5");

    }
}
