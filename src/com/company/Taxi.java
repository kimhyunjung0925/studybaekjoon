package com.company;

public class Taxi extends Tire{
    static int people;

    public static void taxiCall() {
        /*
        택시 10명 승차!!
        주행 속도5
         */
        people = 10;
        System.out.println("택시" + people + "명 승차!!");
        System.out.println("주행속도 5");

    }
    public static void taxiStop() {
        /*
        택시 승객 하차!!
        주행 속도5
         */
        System.out.println("택시 승객 하차!!");
        System.out.println("주행 속도 5");

    }
}
