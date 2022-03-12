package com.example.exam.parsing;

import org.junit.jupiter.api.Test;


class parsingTest {
    @Test
    public void getHtmlTest(){
        ParsingHtml parsing = new ParsingHtml();
        String html = parsing.getHtml("https://velog.io/@outstandingboy/Git-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B7%9C%EC%95%BD-%EC%A0%95%EB%A6%AC-the-AngularJS-commit-conventions");
        System.out.println(html);
    }

}