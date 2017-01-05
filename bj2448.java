/*
 * Author Minov (WonSeok, Cho) 12/27/16 3:05 PM
 * 백준 2448 : 별찍-11
 *
 * 문제 : 예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * 입력 : 첫째 줄에 N이 주어진다. N은 항상 3*2^k 수이다. (3, 6, 12, 24, 48, ...) (k<=10)
 * 출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.
 */

package com.minov.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 27..
 */
public class bj2448 {
    public static char[][] charArr;

    public static void recursive(int intCnt, int intX, int intY) {
        if (intCnt == 3) {
            charArr[intX][intY] = '*';
            charArr[intX + 1][intY + 1] = '*';
            charArr[intX + 1][intY - 1] = '*';
            charArr[intX + 2][intY] = '*';
            charArr[intX + 2][intY + 1] = '*';
            charArr[intX + 2][intY + 2] = '*';
            charArr[intX + 2][intY - 1] = '*';
            charArr[intX + 2][intY - 2] = '*';
            return;
        }

        int intMod = intCnt / 2;
        recursive(intMod, intX, intY);
        recursive(intMod, intX + intMod, intY + intMod);
        recursive(intMod, intX + intMod, intY - intMod);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intGetNum = sc.nextInt();

        charArr = new char[intGetNum][intGetNum*2];
        for(int i=0; i<charArr.length; i++){
            Arrays.fill(charArr[i],' ');
        }
        recursive(intGetNum, 0, intGetNum-1);

        for(int i=0; i<intGetNum; i++){
            System.out.println(charArr[i]);
        }
        sc.close();
    }
}
