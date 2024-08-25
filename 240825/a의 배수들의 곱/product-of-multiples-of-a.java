import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long product = 1; // a의 배수들의 곱을 저장할 변수, long 타입으로 선언

        // 1부터 b까지 반복
        for (int i = a; i <= b; i += a) {
            product *= i; // a의 배수일 경우 곱하기
        }

        // 결과를 출력
        System.out.println(product);

        scanner.close(); // 스캐너 닫기
    }
}