import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt(); // 입력 받기
            if (number == 0) {
                break; // 0이 입력되면 종료
            }
            numbers.add(number); // 리스트에 숫자 추가
        }

        // 리스트에 저장된 숫자들을 출력
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}