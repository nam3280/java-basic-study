package Study.day5_6.section1;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		//81~100 사이의 점수가 랜덤하게 할당된다.

		if(95 <= score && score <= 100){
			System.out.println("당신의 학점은 A+입니다.");
		}else if(90 <= score && score <= 94){
			System.out.println("당신의 학점은 A입니다.");
		}else if(85 <= score && score <= 89){
			System.out.println("당신의 학점은 B+입니다.");
		}else if(80 <= score && score <= 84){
			System.out.println("당신의 학점은 B입니다.");
		}else if(75 <= score && score <= 79){
			System.out.println("당신의 학점은 C+입니다.");
		}else if(70 <= score && score <= 74){
			System.out.println("당신의 학점은 C입니다.");
		}else{
			System.out.println("재수강 하세요!");
		}
	}
}