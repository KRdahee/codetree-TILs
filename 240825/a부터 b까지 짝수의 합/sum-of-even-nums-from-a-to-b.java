import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0; // 짝수의 합을 저장할 변수

        // a부터 b까지 반복
        for (int i = a; i <= b; i++) {
            // 짝수인지 확인
            if (i % 2 == 0) {
                sum += i; // 짝수일 경우 합에 더하기
            }
        }

        // 짝수의 총합 출력
        System.out.println(sum);

        scanner.close(); // 스캐너 닫기
    }
}