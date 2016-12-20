/*
 * Author Minov (WonSeok, Cho) 12/3/16 4:32 PM
 * 백준 2675 : 문자열 반복
 *
 * 문제 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
 *       다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다.
 *       S에는 QR Code "alphanumeric" 문자만 들어있다.
 *       QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
 *
 * 입력 : 첫째 줄에 테스트 케이스의 개수 T(1 <= T <= 1,000)가 주어진다.
 *       각 테스트 케이스는  반복 횟수 R(1 <= R <= 8), 문자열 S가 공백으로 구분되어 주어진다.
 *       S의 길이는 적어도 1이며, 20글자를 넘지 않는다.'
 * 출력 : 각 테스트 케이스에 대해 T를 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 3..
 */
public class bj2675 {
    public static void main(String[] args){
        String[][][] strArr;
        Scanner sc = new Scanner(System.in);

        try {
            int intCnt = sc.nextInt();

            if (intCnt > 1000) {
                throw new NumberFormatException();
            }else{
                strArr = new String[intCnt][intCnt][intCnt];

                for(int i=0; i<intCnt; i++){
                    strArr[i][0][0] = "";
                    strArr[i][0][1] = sc.next();
                    strArr[i][1][1] = sc.next();
                    if(strArr[i][1][1] != null) {
                        for(int i2=0; i2<strArr[i][1][1].length(); i2++){
                            char chr = strArr[i][1][1].charAt(i2);
                            for(int i3=0; i3<Integer.parseInt(strArr[i][0][1]); i3++) {
                                strArr[i][0][0] += chr;
                            }
                        }
                    }
                    System.out.println(strArr[i][0][0]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
            return;
        }
    }
}
