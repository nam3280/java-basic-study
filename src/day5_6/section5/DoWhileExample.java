package Study.day5_6.section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileExample {
	public static void main(String[] args) throws IOException {
		int i = 1;
		do{
			System.out.println("java");
			i++;
		}while(i<6);
//////////////////////////////////////////////////////////////////////
		int sum = 0;
		int j = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("숫자입력 : ");

		while(true) {
			int num = Integer.parseInt(br.readLine());

			if (num < 11) {
				System.out.println("다시입력");
				continue;
			} else {
				do {
					sum += num;
					num++;
					j++;
				} while (j < 11);
				System.out.println(sum);
				break;
			}
		}
	}
}