import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n을 입력받음
        int n = scanner.nextInt();

        int sum = 0; // n의 약수의 합을 저장할 변수

        // 1부터 n/2까지 반복하며 약수를 찾음
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) { // i가 n의 약수인지 확인
                sum += i; // 약수를 합계에 더하기
            }
        }

        // 약수의 합이 n과 같은지 확인
        if (sum == n) {
            System.out.println("P"); // 완전수일 경우 P 출력
        } else {
            System.out.println("N"); // 완전수가 아닐 경우 N 출력
        }

        scanner.close(); // 스캐너 닫기
    }
}