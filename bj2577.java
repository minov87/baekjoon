/*
 * Author Minov (WonSeok, Cho) 12/3/16 1:34 PM
 * 백준 2577 : 숫자의 개수
 *
 * 문제 : 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *       예를 들어 A = 150, B = 266, C = 427 이라면
 *       A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 *       계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 * 입력 : 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
 * 출력 : 첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다.
 *       마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 3..
 */
public class bj2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intNum = new int[3];
        int[] intRst = new int[10];
        intNum[0] = sc.nextInt();
        intNum[1] = sc.nextInt();
        intNum[2] = sc.nextInt();

        if(intNum[0] > 100 && intNum[0] < 1000 || intNum[1] > 100 && intNum[1] < 1000 || intNum[2] > 100 && intNum[2] < 1000) {
            String strSum = String.valueOf(intNum[0] * intNum[1] * intNum[2]);
            for (int i = 0; i < strSum.length(); i++) {
                String str = Character.toString(strSum.charAt(i));
                switch (str) {
                    case "0": ++intRst[0]; break;
                    case "1": ++intRst[1]; break;
                    case "2": ++intRst[2]; break;
                    case "3": ++intRst[3]; break;
                    case "4": ++intRst[4]; break;
                    case "5": ++intRst[5]; break;
                    case "6": ++intRst[6]; break;
                    case "7": ++intRst[7]; break;
                    case "8": ++intRst[8]; break;
                    case "9": ++intRst[9]; break;
                    default: break;
                }
            }

            int intCnt = 0;
            while (intCnt < 10) {
                System.out.println(intRst[intCnt]);
                intCnt++;
            }
            sc.close();
        }
    }
}
