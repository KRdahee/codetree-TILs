import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 학생들의 출석번호와 이름을 매핑하는 HashMap
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "John");
        studentMap.put(2, "Tom");
        studentMap.put(3, "Paul");
        studentMap.put(4, "Sam");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt(); // 입력 받기

            // 입력된 번호가 유효한지 검사
            if (studentMap.containsKey(number)) {
                System.out.println(studentMap.get(number)); // 이름 출력
            } else {
                System.out.println("Vacancy"); // 유효하지 않은 번호일 때
                break; // 프로그램 종료
            }
        }

        scanner.close();
    }
}