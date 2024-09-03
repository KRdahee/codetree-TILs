import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0; // 짝수를 처리한 횟수
        final int MAX_EVEN_COUNT = 3; // 최대 처리할 짝수의 수

        while (evenCount < MAX_EVEN_COUNT) {
            int number = scanner.nextInt(); // 입력 받기

            if (number % 2 == 0) { // 짝수인지 확인
                System.out.println(number / 2); // 2로 나눈 몫 출력
                evenCount++; // 짝수 처리 횟수 증가
            }
        }

        scanner.close(); // 자원 정리
    }
}