package com.example.exam.parsing;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ParsingHtml {
    //html 받아오기
    public String getHtml(String urlPath) {
        String pageContents;
        StringBuilder contents = new StringBuilder();

        try {

            URL url = new URL(urlPath);
            URLConnection con = url.openConnection();
            InputStreamReader reader = new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8);

            BufferedReader buff = new BufferedReader(reader);

            while ((pageContents = buff.readLine()) != null) {
                //System.out.println(pageContents);
                contents.append(pageContents);
                contents.append("\r\n");
            }

            buff.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return contents.toString();
    }
    // 파싱하기
    public String[] result(String html, int type, int bundle){
        // Type별 정규표현식을 지정하여 파싱
        String pattern="";
        if(type ==1){
            pattern = "<[^>]*>"; // 태그내용 제거
        }else if(type ==2){
            pattern = "[^0-9a-zA-Z]"; // 영어 숫자 모두 남김
        }
        html = html.replaceAll(pattern,"");

        // 숫자부분과 알파벳 부분 저장
        String htmlNumber = html.replaceAll("[^0-9]","");
        String htmlAlpha= html.replaceAll("[^a-zA-Z]","");

        // 오름차순 정렬
        htmlNumber = SortStirng(htmlNumber);
        htmlAlpha = SortStirng(htmlAlpha);

        // 교차병합
        int min = Math.min(htmlAlpha.length(), htmlNumber.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
             sb.append(htmlAlpha.charAt(i)).append(htmlNumber.charAt(i));
        }
        // 나머지 연결 - 둘중 남은거만 연결될꺼임
        sb.append(htmlAlpha.substring(min))
                .append(htmlNumber.substring(min));
        // bundle로 몫과 나머지 계산
        int share = sb.length() / bundle;
        String shareStr = sb.substring(0,share*bundle);
        String remainStr = sb.substring(share*bundle);

        String[] res = new String[2];
        res[0] = shareStr;
        res[1] = remainStr;
        return res;
    }
    public static String SortStirng(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
