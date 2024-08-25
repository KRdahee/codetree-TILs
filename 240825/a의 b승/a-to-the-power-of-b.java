import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a의 b 제곱을 계산
        int result = (int) Math.pow(a, b);

        // 결과를 출력
        System.out.println(result);

        scanner.close(); // 스캐너 닫기
    }
}