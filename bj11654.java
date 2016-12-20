/*
 * Author Minov (WonSeok, Cho) 12/3/16 3:04 PM
 * 백준 11654 : 아스키 코드
 *
 * 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 알파벳 소문자, 대문자 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */

package com.minov.test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Minov on 2016. 12. 3..
 */
public class bj11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean a = Pattern.matches("[a-z]", str);
        boolean b = Pattern.matches("[A-Z]", str);
        boolean c = Pattern.matches("[0-9]", str);

        if(a || b || c){
            System.out.println((int) str.charAt(0));
        }
        sc.close();
    }
}
