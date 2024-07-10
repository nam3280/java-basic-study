package Study.day5_6.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyControlExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(br.readLine());

			if(num % 2 == 0 && num > 0){
				System.out.println("짝");
			}else if(num == 0){
				System.out.println("0");
			}else{
				System.out.println("홀");
			}

			System.out.println("계속 입력을 받고 싶으면 1, 끝내고 싶다면 0 입력");

			while(true) {
				num = Integer.parseInt(br.readLine());
				if(num != 1 && num != 0) {System.out.println("다시 입력");}
				else {break;}
			}

			if (num == 0) {break;}
		}
	}
}