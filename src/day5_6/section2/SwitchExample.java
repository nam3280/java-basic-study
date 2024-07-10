package Study.day5_6.section2;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;

		switch(num){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println(num);
				break;
			default:
				System.out.println(num);
		}
	}
}