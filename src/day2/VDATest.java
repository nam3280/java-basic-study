package day2;

public class VDATest
{
    public static void main(String[] args)
    {
        //Q. [정수 : int] 한 개를 저장하기 위해서 변수를 선언하세요. 변수명은 v
        int v;  //변수 선언
        //정수형 변수 v에 20을 할당하세요.
        v = 20;
        //정수형 변수 v에 값을 "v = 10" 출력하세요.
        System.out.println("v = " + v);

        int a = 10; //변수 초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        int sum = 0;
        sum += 1;
        System.out.println("sum = " + sum);
        sum += 2;
        System.out.println("sum = " + sum);
        sum += 3;
        System.out.println("sum = " + sum);
        sum += 4;
        System.out.println("sum = " + sum);
        sum += 5;
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        System.out.printf("x = %d, y = %d\n",x ,y);
        int z = x;
        x = y;
        y = z;
        System.out.printf("x = %d, y = %d",x ,y);
    }
}
