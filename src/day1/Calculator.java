package day1;

public class Calculator {

    public static void main(String[] args) {

        CalUse cal = new CalUse();
        // 클래스이름 별명 = new 클래스이름(); -> 다른 클래스를 가져오는 법
        //stack에 cal이 저장되고 Heap에서는 CalUse, a, b(CalUse 안에 있는 변수)등을
        //저장 후 참조
        cal.cal_print();
        //cal_print를 stack에 저장됨
        CalUse cal1 = new CalUse();

        cal1.cal_print();

        //ctrl + shift + alt + L : 정리
    }
}
