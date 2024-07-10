package Study.day5_6.section2;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
			int time = (int)(Math.random() * 4) + 8;

			switch (time){
				case 8:
					System.out.printf("출근을 합니다. %d",time);
					break;
				case 9:
					System.out.printf("회의를 합니다. %d",time);
					break;
				case 10:
					System.out.printf("업무를 합니다. %d",time);
					break;
				case 11:
					System.out.printf("출장을 나갑니다. %d",time);
					break;
				default:
					System.out.printf("에러 %d",time);
			}
		}
	}
