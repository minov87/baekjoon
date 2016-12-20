/*
 * Author Minov (WonSeok, Cho) 12/10/16 2:11 AM
 * 백준 2558 : A+B-2
 *
 * 문제 : A+B를 계산하시오.
 *
 * 입력 : 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 출력 : 첫째 줄에 A+B를 출력한다. (A+B < 10)
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 10..
 */
public class bj2558 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intA=0, intB=0;

        intA = sc.nextInt();
        intB = sc.nextInt();

        if(intA > 0 && intB < 10)
            if((intA+intB) < 10) System.out.println(intA+intB);

        sc.close();
    }
}
