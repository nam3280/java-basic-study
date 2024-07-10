package Study.day5_6.section2;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법


        //Java 12부터 가능
        int score2 = switch (grade) {
            case "A" -> 100;//한 줄 코딩일 때 중괄호 필요없음
            case "B" -> {
                int result = 100 - 20;
				//자바13 지원
                yield result;
            }
            default -> 60;//yield를 사용하면 default가 꼭 있어야 함
        };

		System.out.println("score2 = " + score2);
    }
}