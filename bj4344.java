/*
 * Author Minov (WonSeok, Cho) 12/19/16 5:19 PM
 * 백준 4344 : 평균은 넘겠지
 *
 * 문제 : 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 입력 : 첫째 줄에는 테스트케이스 C가 주어진다.
 *       둘째 줄부터 각 테스트케이스 마다 첫 수로 정수 N(1 <= N <= 1000)명의 학생이 주어지고
 *       그 다음으로 N명의 0부터 100 사이의 점수가 이어서 주어진다.
 * 출력 : 각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째자리에서 반올림하여 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 19..
 */
public class bj4344 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int intTestCase = sc.nextInt();
        if(intTestCase > 0) {
            int[][][] intScoreAvg = new int[intTestCase][2][3];
            int[][] intCaseScore = new int[intTestCase][1000];

            main : for (int i = 0; i < intTestCase; i++) {
                int intSubTestCase = sc.nextInt();
                if (intSubTestCase > 0 && intSubTestCase <= 1000) {
                    intScoreAvg[i][0][0] = intSubTestCase;
                    sub : for (int j = 0; j < intSubTestCase; j++) {
                        int intTmpCaseScore = sc.nextInt();
                        if (intTmpCaseScore >= 0 && intTmpCaseScore <= 100) {
                            intCaseScore[i][j] = intTmpCaseScore;
                            intScoreAvg[i][1][0] += intCaseScore[i][j];
                        }else{
                            break sub;
                        }
                    }
                    intScoreAvg[i][1][1] = intScoreAvg[i][1][0] / intScoreAvg[i][0][0];

                    for (int k = 0; k < intSubTestCase; k++) {
                        if (intCaseScore[i][k] > intScoreAvg[i][1][1]) intScoreAvg[i][1][2]++;
                    }
                    System.out.printf("%.3f%s", ((double) intScoreAvg[i][1][2] / (double) intScoreAvg[i][0][0]) * 100d, "%\n");
                }else{
                    break main;
                }
            }
            sc.close();
        }
    }
}
