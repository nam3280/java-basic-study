package day3;

public class CastingEx
{
    public static void main(String[] args)
    {
        byte byteValue = 10;
        int intValue = byteValue;

        System.out.println(intValue);

        char charValue = 'A';
        int intValue1 = charValue;//promotion
        char charValue1 = (char)intValue1;//down casting

        System.out.println(intValue1);
        System.out.println(charValue1);

        int v1 = 10302997;
        byte bv1 = (byte)v1;

        System.out.println(v1 + " " + bv1);

        long longValue = 300L;
        int intValue2 = (int)longValue;

        System.out.println(intValue2);

        //연산식 자동 타입 변환
        //자바는 실행 속도의 향상을 위해 컴파일 단계에서 연산을 수행한다.
        byte result = 10 + 20;

        //상수 : 변하지 않는 변수 ex) result, intValue
        //리터럴 : 변수에 넣는 변하지 않는 데이터 ex) 10, 20, 10 + 20(x);
        //정수 리터럴이 아닌 변수가 오퍼랜드로 사용되면 실행 시 연산을 수행한다.
        //오퍼랜드 : 연산을 수행할 때 필요한 데이터나 데이터 주소

        byte x = 10;
        byte y = 20;
        int result1 = x + y; //result -> 피연산자
        //자바에서는 자동으로 byte, short 타입의 연산식을 계산할 때 promotion한다.
        //그러나 피연산자가 데이터 타입이 더 커야 한다.

        int intValue3 = 10;
        double doubleValue3 = 5.5;
        double result3 = intValue3 + doubleValue3;

        System.out.println(result3);

        int result4 = intValue3 + (int)doubleValue3;

        System.out.println(result4);

        int a = 1;
        int b = 2;

        double c = (double)a / b;
        double d = (double)(a / b);//연산하기 전에 캐스팅을 해야한다.

        System.out.println(c + " " + d);

        //자바에서 + 연산자의 기능
        //1. 연산자가 모두 숫자일 경우 덧셈연산 수행
        //2. 피연산자 중 하나가 문자일 경우 나머지 피연산자도 문자열로 promotion되어 문자열 결합 연산

        int op1 = 3 + 7; //10
        String op2 = "3" + 7; //"37"
        String op3 = "3" + "7"; //"37"
        int op4 = 1 + 2 + 3; // 3 + 3 = 6
        String op5 = 1 + 2 + "3"; //  "33" -> 1 + 2 이후에 3이 붙는다.
        String op6 = 1 + "2" + 3; // "123"
        String op7 = "1" + 2 + 3; // "12" + 3 = "123" -> 결합연산
        String op8 = "1" + (2 + 3); // "1" + 5 = "15"

        //String 타입변환
        int op9 = Integer.parseInt("10");
        System.out.println(op9 + 10);

        double op10 = Double.parseDouble("3.14");
        System.out.println(op10 + 5.5);

        boolean op11 = Boolean.parseBoolean("true");
        System.out.println(op11);

        //기본 타입으로 바꾼 값을 다시 String 타입으로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(op10);
        String str3 = String.valueOf(op11);

        //변수의 유효범위 (Variable scope) : 해당 변수가 접근 가능한 범위
        //자바에서는 변수가 선언된 위치에 따라 범위가 결정된다.

        //1. 블럭 내부의 변수
        int aa = 10;
        if(aa == 10)
        {
            int bb = 20;
            System.out.println("aa = " + aa + " bb = " + bb);
        }
        System.out.println("aa = " + aa);

        //2. 메소드의 내부 변수 : 메소드 내에서 선언된 변수는 메소드 내에서만 유효하다.
        int result5 = calculator(100,200);
        System.out.println(result);
    }

//    public static void calculator(int n1, int n2)
//    {
//        int result = n1 + n2;
//        System.out.printf("%d + %d 의 결과는 %d", n1,n2,result);
//    }
    public static int calculator(int n1, int n2)
    {
        int result = n1 + n2;
        System.out.printf("%d + %d 의 결과는 %d\n", n1,n2,result);
        return result;
    }
}
