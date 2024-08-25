import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0; // 조건에 맞는 수들의 합을 저장할 변수

        // a부터 b까지 반복
        for (int i = a; i <= b; i++) {
            // 6의 배수이면서 8의 배수가 아닌 수인지 확인
            if (i % 6 == 0 && i % 8 != 0) {
                sum += i; // 조건을 만족하는 수를 합계에 더하기
            }
        }

        // 합계를 출력
        System.out.println(sum);

        scanner.close(); // 스캐너 닫기
    }
}