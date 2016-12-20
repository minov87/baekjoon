/*
 * Author Minov (WonSeok, Cho) 12/14/16 10:11 AM
 * 백준 11719 : 그대로 출력하기2
 *
 * 문제 : 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 *       각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 * 출력 : 입력받은 그대로 출력한다.
 */

package com.minov.test;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Minov on 2016. 12. 14..
 */
public class bj11719 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int intCnt = 1;
        String str;

        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (intCnt > 100
                    || str.length() > 100
                    || !Pattern.matches("^([\\s\\w])*", str))
                break;


            System.out.println(str);
            intCnt++;
        }

        sc.close();
    }
}
