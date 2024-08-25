import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long product = 1; // 곱을 저장할 변수 (long 타입으로 선언)

        // a부터 b까지 반복
        for (int i = a; i <= b; i++) {
            product *= i; // 현재 숫자를 곱함
        }

        // 결과를 출력
        System.out.println(product);

        scanner.close(); // 스캐너 닫기
    }
}