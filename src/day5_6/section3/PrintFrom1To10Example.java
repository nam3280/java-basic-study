package Study.day5_6.section3;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i < 11; i++){
			sum += i;
			System.out.printf("sum = %d, i = %d\n",sum ,i);
		}

		System.out.println("sum = " + sum);
	}
}