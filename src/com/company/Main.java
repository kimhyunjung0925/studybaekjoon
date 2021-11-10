package com.company;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();


        // 작성 코드 상관 없이 출력된 내용은 사진과 동일하면 정답!!!
        car.carInfo();
        System.out.println("-------------------------------");
        //car.tireModel();

        System.out.println("-------------------------------");
        /*
        setNowSpeed(값) 입력후 carGo() 또는 carBreak() 에 아래 와같이 출력
        시동 꺼짐!! or 차량 이상 발생 시동 꺼짐!!
         */
        //car.setNowSpeed(값);

        System.out.println("-------------------------------");
        car.carGo();

        System.out.println("-------------------------------");
        car.carBreak();

        System.out.println("-------------------------------");
        //car.taxiCall();
        //car.putItem();

        System.out.println("-------------------------------");
        //car.taxiStop();
        //car.pullItem();

        System.out.println("-------------------------------");


    }
}
