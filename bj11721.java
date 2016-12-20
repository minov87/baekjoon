/*
 * Author Minov (WonSeok, Cho) 12/18/16 6:15 PM
 * 백준 11721 : 열 개씩 끊어 출력하기
 *
 * 문제 : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
 * 출력 : 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 이하의 글자만 출력할 수도 있다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 18..
 */
public class bj11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int intCnt = 0;

        if (str.length() <= 100 || str.length() == 0) {
            if(str.length() > 10){
                for (int i = 0; i <= str.length(); i++) {
                    if (i > 0 && i % 10 == 0) {
                        System.out.println(str.substring(i - 10, i));
                        intCnt++;
                    } else {
                        if (i == str.length()) {
                            System.out.println(str.substring(intCnt * 10, str.length()));
                        }
                    }
                }
            }else{
                System.out.println(str);
            }
        }
        sc.close();
    }
/*
        if(str.length() <= 100 || str.length() == 0) {
            while (true) {
                if (intSS > str.length()) {
                    break;
                }

                // 몫이 0이 아닌값 분기 (10의 배수가 아닌)
                if (str.length() % 10 == 0) {
                    System.out.println(str.substring(intSS, intSS + 10));
                } else {
                    if (str.length() - intSS > 10) {
                        System.out.println(str.substring(intSS, intSS + 10));
                    } else {
                        System.out.println(str.substring(intSS, str.length()));
                    }
                }
                intSS += 10;
            }
        }
    }*/
}
