package day3;

import java.lang.reflect.AccessibleObject;

public class VariableScopeExam
{
    static
    {
        int anmos = 500;
        System.out.println("anmos = " + anmos);
    }

    static int globalValue = 100; //클래스 변수(전역변수) -> 모든 인스턴스에서 접근 가능

    public static void main(String[] args)
    {
        System.out.println("globalValue = " + globalValue);

        //변수 : 값을 넣을 수 있는 이름이 붙어있는 공간
        //인스턴스 : 객체가 메모리에 할당되어 사용되는 것, 클래스에 소속된 개별적인 객체
        //ex) String으로 abcd 문자열을 생성하면 이 문자열은 String 클래스의 인스턴스이다.
        VariableScopeExam instance = new VariableScopeExam();//인스턴스 생성, VariableScopeExam()
        instance.AccessInstanceVariable();//인스턴스 메소드를 호출하여 인스턴스 메소드의 지역변수에 접근
        ModifyGlobalValue();//static 메소드는 인스턴스 생성하지 않고 직접 호출한다.

        //렉시컬 스코프란 변수의 유효 범위가 코드의 작성 위치에 의해 결정된다.

    }

    public void AccessInstanceVariable()
    {
        int localVariable = 200;
        System.out.println("localVariable = " + localVariable + globalValue);
    }

    public static void ModifyGlobalValue()
    {
        globalValue = 200;
        System.out.println("globalValue = " + globalValue);
    }
}
