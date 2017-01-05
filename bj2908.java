/*
 * Author Minov (WonSeok, Cho) 1/5/17 5:08 PM
 * 백준 2908 : 상수
 *
 * 문제 : 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
 *       이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
 *       상근이는 세 자리 숫자 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 *       상수는 수를 다른사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면,
 *       상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 *       두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않으며, 0이 포함되어 있지 않다.
 * 출력 : 첫째 줄에 상수의 대답을 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2017. 1. 5..
 */
public class bj2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = {"",""};
        boolean blSucc = false;

        for(int i=0; i<2; i++){
            String str = Integer.toString(sc.nextInt());

            for(int k=str.length()-1; k>-1; k--){
                char chr = str.charAt(k);
                if(chr == '0'){
                    blSucc = false;
                    break;
                }else{
                    strArr[i] += String.valueOf(chr);
                    blSucc = true;
                }
            }
        }

        if(blSucc) {
            if (Integer.parseInt(strArr[0]) > Integer.parseInt(strArr[1])) {
                System.out.println(strArr[0]);
            } else {
                System.out.println(strArr[1]);
            }
        }
    }
}