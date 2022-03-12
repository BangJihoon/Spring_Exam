# Spring_Exam

### Spring 과제 
- URL 소스 파싱기

### 구현 환경
 + IntelliJ
 + Java 11 / Gradle / Spring 2.6.1


### 구현 문제
1. URL 
    + 입력을 하면 그 링크 안에있는 모든 HTML코드를 불러온다.
2. 노출 유형
    + 노출 유형이 HTML 일 경우는 태그를 제거한다
    + 노출 유형이 TEXT 일 경우에는 모든 텍스트 포함
3. 영어, 숫자만 출력
   + 결과 데이터는 영어와 숫자로만 구성된 데이터만 출력한다
4. 오름차순 정렬
    + 영어 : AaBbCcDd ... Zz
    + 숫자 : 0123456789
5. 교차 출력
    + 영어 숫자 영어 숫자
    + 더 이상 출력될 숫자 또는 영어가 없을 경우 남아있는 정렬된
    + 문자열 그대로 출력
6. 출력 묶음 단위
    + 사용자가 입력한 자연수의 묶음 단위를 기준으로 몫과 나머지를구하여 노출
    + 예) ‘A0a1B2b3’, 출력 묶음 단위 3인경우
    + 몫 ‘A0a1B2’
    + 나머지 ‘b3’


### 깃 Commit 규칙
+ 커밋 단위는 기능당 한개
+ 커밋 메시지 통일성 있게 
+ [앵귤러 커밋 컨벤션 참고](https://velog.io/@outstandingboy/Git-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B7%9C%EC%95%BD-%EC%A0%95%EB%A6%AC-the-AngularJS-commit-conventions)

  + feat : 새로운 기능 추가
  + fix : 버그 수정
  + docs : 문서 관련
  + style : 스타일 변경 (포매팅 수정, 들여쓰기 추가, …)
  + refactor : 코드 리팩토링
  + test : 테스트 관련 코드
  + build : 빌드 관련 파일 수정
  + chore : 그 외 자잘한 수정
  

### 구현 사진

![image](https://user-images.githubusercontent.com/26866859/158022303-b370f89d-41ed-4516-9c0d-d11bc648b67d.png)

