package Study.day5_6.section2;

public class SwitchExpressionsExample {
	public static void main(String[] args) {
		char grade = 'A';

		switch(grade){//자바 12부터 표현식(Expression) 지원
			case 'A', 'a' -> System.out.println("우수");
			case 'B', 'b' -> System.out.println("일반");
			default -> System.out.println("손님");
		}
	}
}