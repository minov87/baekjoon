/*
 * Author Minov (WonSeok, Cho) 12/19/16 3:26 PM
 * 백준 1546 : 평균
 *
 * 문제 : 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최대값을 골랐다.
 *       이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 *       예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 *       세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다.
 *       이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 * 출력 : 첫째 줄에 새로운 평균을 소수점 셋째 자리에서 반올림해 둘째자리까지 출력한다.
 */

package com.minov.test;

import java.util.*;

/**
 * Created by Minov on 2016. 12. 19..
 */
public class bj1546 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        // 시험 과목수 N
        int intExamCnt = sc.nextInt();
        int intMaxScore = 0;
        double dbExamSum = 0.0;
        int[] intList = new int[intExamCnt];

        // 시험과목이 1000보다 작거나 같으므로
        if(intExamCnt <= 1000) {
            for (int i = 0; i < intExamCnt; i++) {
                int temp = sc.nextInt();
                if (temp > 0 && temp <= 100) intList[i] = temp;
            }

            // 최대값
            if (intList.length > 0) {
                for (int i = 0; i < intList.length; i++) {
                    if (intMaxScore == 0) intMaxScore = intList[i];
                    if (intMaxScore < intList[i]) intMaxScore = intList[i];
                }

                if (intMaxScore > 0) {
                    for (int i = 0; i < intList.length; i++) {
                        dbExamSum += (double) intList[i] / (double) intMaxScore * 100d;
                    }

                    System.out.printf("%.2f", dbExamSum / (double)intExamCnt);
                }
            }
        }
    }
}
