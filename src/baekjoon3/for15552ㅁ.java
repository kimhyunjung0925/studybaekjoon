package baekjoon3;

import java.io.*;
import java.util.Scanner;

//뭔소린지 모르겠음
public class for15552ㅁ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        for(int i = 0; i < N; i++){
            String s = bf.readLine(); // N만큼 예제 입력 (N이 5면 5번의 예제 입력)
            int a = Integer.parseInt(s.split(" ")[0]); //s.split(" ") 공백을 기준으로 잘라내 출력, 0번째 숫자
            int b = Integer.parseInt(s.split(" ")[1]); //s.split(" ") 공백을 기준으로 잘라내 출력, 1번째 숫자
            bw.write(a+b+"\n"); //A+B출력, 개행
        }
        bw.flush(); //벼퍼를 비운다
    }
}

