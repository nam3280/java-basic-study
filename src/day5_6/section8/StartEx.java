package Study.day5_6.section8;

public class StartEx {
    public static void main(String[] args) {
       for(int i = 0; i < 5; i++) {
           for(int k = 0; k < i; k++) {
               System.out.print(" ");
           }
           for(int j = 9 - (i * 2); j > 0; j--) {
               System.out.print("*");
           }

           System.out.println();
       }

        for(int i = 0; i < 5; i++) {
            for(int k = 5; k > i + 1; k--) {
                System.out.print(" ");
            }
            for(int j = 9; j >= 9 - (i * 2) ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*********
// *******
//  *****
//   ***
//    *