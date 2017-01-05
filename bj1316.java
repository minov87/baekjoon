/*
 * Author Minov (WonSeok, Cho) 1/5/17 1:45 PM
 * 백준 1316 : 그룹 단어 체커
 *
 * 문제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 *       예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 *       aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *       단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
 *       둘째줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2017. 1. 5..
 */
public class bj1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {

            int intCnt = sc.nextInt();
            int intResultCnt = intCnt;

            if (intCnt <= 100) {
                String[] strArr = new String[intCnt + 1];

                for (int i = 0; i <= intCnt; i++) {
                    strArr[i] = sc.nextLine();

                    if (strArr[i] != null && strArr[i].length() <= 100) {
                        char chrTest = 0;
                        boolean[] blAlpha = new boolean[27];

                        forb : for(int k=0; k<strArr[i].length(); k++){
                            char chr = strArr[i].charAt(k);
                            if(blAlpha[chr-'a']){
                                if(chrTest != chr){
                                    intResultCnt--;
                                    break forb;
                                }
                            }else blAlpha[chr-'a'] = true;
                            chrTest = chr;
                        }
                    }else{
                        new NumberFormatException();
                    }
                }
                System.out.println(intResultCnt);
            }else{
                new NumberFormatException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
        }
    }
}
