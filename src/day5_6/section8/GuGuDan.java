package Study.day5_6.section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan {
    public static void main(String[] args) throws IOException {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n",i ,j ,i * j);
            }
        }
////////////////1번//////////////////////
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n",num ,i ,num*i);
        }
////////////////2번//////////////////////

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        for(int i = num1; i < num2 + 1; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
