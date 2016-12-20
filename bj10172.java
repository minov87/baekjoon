/*
 * Author Minov (WonSeok, Cho) 12/9/16 9:01 PM
 * 백준 10172 : 개
 *
 * 문제 : 아래 예제와 같이 개를 출력하시오.
 * |\_/|
 * |q p|   /}
 * ( 0 )"""\
 * |"^"`    |
 * ||_/=\\__|
 *
 * 입력 : 없음
 * 출력 : 개를 출력한다.
 */

package com.minov.test;

/**
 * Created by Minov on 2016. 12. 9..
 */
public class bj10172 {
    public static void main(String[] args) {

        StringBuffer stb = new StringBuffer();
        stb.append("|\\_/|\n");
        stb.append("|q p|   /}\n");
        stb.append("( 0 )\"\"\"\\\n");
        stb.append("|\"^\"`    |\n");
        stb.append("||_/=\\\\__|\n");

        System.out.print(stb.toString());
    }
}
