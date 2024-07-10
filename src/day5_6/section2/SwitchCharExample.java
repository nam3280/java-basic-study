package Study.day5_6.section2;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (Character.toUpperCase(grade)){//대문자 처리
			case 'A':
				System.out.println("우수");
				break;
			case 'B':
				System.out.println("일반");
				break;
			default:
				System.out.println("손님");
		}
	}
}