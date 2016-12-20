/*
 * Author Minov (WonSeok, Cho) 12/5/16 2:54 PM
 * 백준 2750 : 수 정렬하기
 *
 * 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 수의 개수 N(1<=N<=1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 *       이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

package com.minov.test;

import java.util.*;

/**
 * Created by Minov on 2016. 12. 5..
 */
public class bj2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intCnt = sc.nextInt();
        TreeSet<Integer> data = new TreeSet<Integer>();
        ArrayList arrList = new ArrayList();

        for(int i=0; i<intCnt; i++){
            int tmp = sc.nextInt();
            data.add(tmp);
            arrList.add(tmp);
        }

        // Iterator의 역할은 저장된 데이터들 사이에서 순방향으로 이동하면서 데이터를 가져오거나 삭제할수 있는 기능을 제공
        Iterator<Integer> it = data.iterator();
        while(it.hasNext()) System.out.println(it.next());

        Collections.sort(arrList);
        System.out.println(arrList);

        sc.close();
    }
}
