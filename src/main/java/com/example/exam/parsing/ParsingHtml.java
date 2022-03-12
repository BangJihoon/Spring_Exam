package com.example.exam.parsing;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

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

}
