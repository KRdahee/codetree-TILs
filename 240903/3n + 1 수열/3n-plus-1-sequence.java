import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int count = 0; // 반복 횟수를 저장할 변수

        // N이 1이 될 때까지 반복
        while (N != 1) {
            if (N % 2 == 0) {
                // N이 짝수인 경우
                N = N / 2;
            } else {
                // N이 홀수인 경우
                N = 3 * N + 1;
            }
            count++; // 반복 횟수 증가
        }

        // 결과 출력
        System.out.println(count);

        scanner.close(); // 자원 정리
    }
}