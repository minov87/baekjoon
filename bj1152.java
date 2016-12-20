/*
 * Author Minov (WonSeok, Cho) 12/3/16 1:03 PM
 * 백준 1152 : 단어의 개수
 *
 * 문제 : 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다.
 *       이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 *       단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
 *
 * 입력 : 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다.
 * 출력 : 첫째 줄에 단어의 개수를 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 3..
 */
public class bj1152 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strTxt = sc.nextLine();
        int intCnt = 0;
        String strResult = "";

        if(strTxt.length() > 1000000) {
            for (int i = 0; i < strTxt.length(); i++) {
                String str = String.valueOf(strTxt.charAt(i));
                if (str.equals(" ")) {
                    strResult = "";
                } else {
                    if (strResult.length() == 0) {
                        intCnt++;
                    }
                    strResult = str;
                }
            }

            System.out.println(intCnt);
        }


        sc.close();
    }
}
