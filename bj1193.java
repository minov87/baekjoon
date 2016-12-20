/*
 * Author Minov (WonSeok, Cho) 12/5/16 1:23 PM
 * 백준 1193 : 분수찾기
 *
 * 문제 : 무한히 큰 배열에 다음과 같이 분수들을 적혀있다.
 *       1/1 1/2 1/3 1/4 1/5 …
 *       2/1 2/2 2/3 2/4 …   …
 *       3/1 3/2 3/3 …	 …   …
 *       4/1 4/2 …	 …	 …   …
 *       5/1 …	 …	 …	 …   …
 *       …	 …	 …	 …	 …   …
 *
 *       이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *       X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 X(1≤X≤10,000,000)가 주어진다.
 * 출력 : 첫째 줄에 분수를 출력한다.
 */

package com.minov.test;

import java.util.Scanner;

/**
 * Created by Minov on 2016. 12. 5..
 */
public class bj1193 {
    public static void main(String[] args){
        int find; 	// 찾을 위치
        int n;		// 찾을 위치가 몇 번째 줄에 위치해 있는가
        int min;	// 각 줄의 최소값
        int max;	// 각 줄의 최대값

        Scanner sc = new Scanner(System.in);
        find = sc.nextInt();

        for(n=1;;n++){	// 입력값이 위치한 줄을 찾는다
            min = n*(n+1)/2-n;
            max = n*(n+1)/2;
            if((min < find) && (find <= max))
                break;	 // 입력값이 위치한 줄(n)을 찾았다
        }

        System.out.println(n);

        if(n%2==1){	// 줄이 홀수 일 때
            int u = 1;	// 분자
            int d = n;	// 분모
            while(true){
                if(max==find){    // 입력값을 찾았다
                    System.out.println(u +"/"+d);
                    break;
                }
                else{    // 찾지 못하면 최대값을 감소, 분자는 증가, 분모는 감소
                    max--;
                    u++;
                    d--;
                }
            }
        }
        else{	// 줄이 짝수 일 때
            int u = n;
            int d = 1;
            while(true){
                if(max==find){ // 입력값을 찾았다
                    System.out.println(u +"/"+d);
                    break;
                }
                else{    // 찾지 못하면 최대값을 감소, 분자는 감소, 분모는 증가
                    max--;
                    u--;
                    d++;
                }
            }
        }

        sc.close();
    }
}
