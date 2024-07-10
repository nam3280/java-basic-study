package day3;

import java.sql.SQLOutput;

public class StringExam {
    public static void main(String[] args) {
        //이스케이프 문자 : 문자열 내부에 역슬래쉬(\)가 붙은 문자
        //ex) \n : 줄 바꿈

        String name = "java";
        String job = "Programming";
        String str = "나는 \"" + name + "\t" + job + "\" 를 배웁니다.";
        // \" : "포함
        // \t : tap 한번만큼 띄어쓰기

        System.out.println(str);

        String str4 = """ 
                { 안녕하세요
                  반갑습니다.
                  id : silver
                  pwd : 0000
                }
                """;
        System.out.println(str4);
    }
}
