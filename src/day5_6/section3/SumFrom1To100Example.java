package Study.day5_6.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumFrom1To100Example{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int count = st.countTokens();

		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
		}

		System.out.println(sum);
	}
 }