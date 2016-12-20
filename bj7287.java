/*
 * Author Minov (WonSeok, Cho) 12/8/16 7:41 PM
 * 백준 7287 : 등록
 *
 * 문제 : 자신이 온라인 저지에서 맞은 문제의 개수와 아이디를 그대로 출력하는 프로그램을 작성하시오.
 * 입력 : 이 문제는 입력이 없다
 * 출력 : 첫 줄에 자신이 맞은 문제의 수, 둘째 줄에 아이디를 출력한다.
 *
 * p.s) 파싱인줄 알았더니 그냥 찍는거였다는... 쩝.
 */

package com.minov.test;

import java.io.*;
import java.net.*;

/**
 * Created by Minov on 2016. 12. 8..
 */
public class bj7287 {
    public static void main(String[] args) throws Exception {
        String strUsername = "minov", strResultCnt = "30", inputLine;
        /*
        RL acmUrl = new URL("https://www.acmicpc.net/user/"+strUsername);

        HttpURLConnection httpcon = (HttpURLConnection) acmUrl.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.0");
        httpcon.setRequestMethod("GET");
        InputStream is = httpcon.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        while ((inputLine = br.readLine()) != null) {
            if (inputLine.contains("user_id="+strUsername+"&amp;result_id=4&amp;language_id=3")) {
                strResultCnt = inputLine;
                break;
            }
        }

        br.close();

        strResultCnt = strResultCnt.replace("<a href = \"","")
                .replace("/status?user_id=" + strUsername + "&amp;result_id=4&amp;language_id=3\">", "")
                .replace("</a>", "").trim();
        */
        System.out.println(strResultCnt);
        System.out.println(strUsername);
    }
}
