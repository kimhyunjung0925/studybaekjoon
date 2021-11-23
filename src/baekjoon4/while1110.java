package baekjoon4;

import java.util.Scanner;

public class while1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int eq = A;
        int count = 0;

        while(true) {
            A = ((A % 10) * 10) + (((A / 10) + (A % 10)) % 10);
            //첫째자리에 *10해서 10의자리수로 만듬, 두번째 자리에 각 합을 넣는다(단, 합이 10을 넘을 수도 있으므로 %10해줌)
            count++;
            if (eq == A) {
                break;
            }
        }
        System.out.println(count);
    }
}

