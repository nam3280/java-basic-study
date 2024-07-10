package day2;

public class VDATest1
{
    public static void main(String[] args) {
        int age;
        int value;
        int score = 0;
        //문자타입은 하나의 문자 '' -> 문자리터럴은 유니코드로 저장 된다.
        //유니코드 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약
        //자바는 유니코드를 저장할 수 있도록 char 타입을 제공한다.

        char var1 = 'A';    //숫자 : 65
        char var2 = 65;
        char var3 = '가';    //가는 44032 대입
        char var4 = 44032;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);

        //char -> 숫자형 변수
        char c = ' ';    //공백의 유니코드 : 32, 띄어쓰기라도 값을 반드시 넣어서 초기화 해야한다.

        //리터럴 : 코드에서 프로그래머가 직접 입력한 값
        //ex) 0b, 0x 등

        //2진수 : 0b or 0B로 시작
        int x = 0b1011;//
        int y = 0b10100; // 20

        //8진수 : 0로 시작
        int o1 = 013;// (1 * 8) + (3 * 1) = 11
        int o2 = 0206;// (2 * 64) + (6 * 1) = 134

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);

        //16진수 : 0x, 0X로 시작
        int z = 0xB3;// (11 * 16) + (3 * 1) = 179
        int x1 = 0x2A0F;// (2 * 16 * 16 * 16) + (10 * 16 * 16) + (15 * 1) = 10767

        System.out.println("z = " + z);
        System.out.println("x1 = " + x1);

        byte v1 = -128;
        byte v2 = (byte) 128;//다운캐스팅, -128 출력

        System.out.println(v1 + " " + v2);

        //long 타입은 수치가 큰 데이터를 다루는 프로그램에서 사용된다.
        long l1 = 10;
        long l2 = 20L;
        long l3 = 1000000000000000000L;

        double d1 = 0.25;
        double d2 = -3.14;

        double d3 = 5e2; //5.0 * (10 * 10)
        double d4 = 0.12E-2;//0.12 * (10 * 1/100)
    }
}
