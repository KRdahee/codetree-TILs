import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n의 값 입력받기

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(); // a 값 입력받기
            int b = scanner.nextInt(); // b 값 입력받기
            long product = 1; // 곱을 저장할 변수

            // a부터 b까지 곱셈
            for (int j = a; j <= b; j++) {
                product *= j; // 곱하기
            }

            System.out.println(product); // 결과 출력
        }

        scanner.close();
    }
}