package com.company;

import com.sun.xml.internal.bind.v2.TODO;

public class Car {
    private String color; // 색상
    private String carModel; // 자동차 모델명
    private static int maxSpeed; // 최대 속도
    private static int nowSpeed; //현재 속도

    public void carInfo(){
        this.color = "검정색";
        this.carModel = "그랜저";
        this.maxSpeed = 150;
    }

    public static void carGo() {
        /*
        maxSpeed가 0 이면 차량의 최대속력이 없습니다. - 출력
        nowSpeed가 0 이거나 maxSpeed 보다 작으면  nowSpeed에 5 추가, 주행 속도5 - 출력
        그외 상황 -   시동 꺼짐!! - 출력, carGo() 호출시 다시 5부터 시작.
         */

        //TODO carGo()호출시 다시 5부터 시작
        maxSpeed = 0;
        nowSpeed = nowSpeed + maxSpeed;

        if(maxSpeed == 0){
            System.out.println("차량의 최대속력이 없습니다.");
        } else if(nowSpeed == 0 || nowSpeed < maxSpeed) {
            nowSpeed = nowSpeed + 5;
            System.out.println("주행속도 5");
        } else {
            System.out.println("시동 꺼짐!!");
        }
    }

    public void carBreak() {
        /*
        현재 속도 0 차량 정지!!! - 출력
        nowSpeed가 maxSpeed 보다 작고, 10보다 크거나 같다면 속도 -5감소, 속도 감소 현재 속도 10 - 출력, 작다면 현재 속도 0 차량 정지!!!- 출력
        그외 상황 -  크면 차량 이상 발생 시동 꺼짐!!  - 출력
         */
        if(maxSpeed == 0 && nowSpeed == 0) {
            System.out.println("차량의 최대속력이 없습니다.");
        } else if(nowSpeed  < maxSpeed && nowSpeed >= 10) {
            nowSpeed = nowSpeed -10;
            System.out.println("속도 감소 현재 속도 10");
        } else if(nowSpeed <10) {
            System.out.println("현재 속도 0 차량 정지");
        } else {
            System.out.println("차량 이상 발생 시동 꺼짐");
        }


    }
}
