package baekjoon2;

import java.util.Scanner;
//틀림 60점대 안넣고 돌림,,
public class TestResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        A = sc.nextInt();
        if(A>=90){
            System.out.println("A");
        } else if(A<90 && A>=80){
            System.out.println("B");
        } else if(A<80 && A>=70){
            System.out.println("C");
        } else if(A<70 && A>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}

