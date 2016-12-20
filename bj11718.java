/*
 * Author Minov (WonSeok, Cho) 12/9/16 9:22 PM
 * 백준 11718 : 그대로 출력하기
 *
 * 문제 : 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력 : 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 *       각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 * 출력 : 입력받은 그대로 출력한다
 */

package com.minov.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Minov on 2016. 12. 9..
 */
public class bj11718 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int intCnt = 1;
        String str;
        ArrayList<String> strlist = new ArrayList<String>();

        while(sc.hasNextLine()){
            str = sc.nextLine();
            if (intCnt > 100
                    //|| str.isEmpty()
                    //|| str.startsWith(" ")
                    //|| str.endsWith(" ")
                    || str.length() > 100
                    || !Pattern.matches("^([a-zA-Z0-9 ]+)", str))
                break;


            System.out.println(str);
            intCnt++;
        }

        sc.close();
    }
}
