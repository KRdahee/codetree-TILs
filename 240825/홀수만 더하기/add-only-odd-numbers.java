import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 정수 n을 입력받음
        int n = scanner.nextInt();
        
        int sum = 0; // 총합을 저장할 변수 초기화

        // n개의 정수를 입력받음
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt(); // 정수 입력받기

            // 홀수이면서 3의 배수인지 확인
            if (number % 2 != 0 && number % 3 == 0) {
                sum += number; // 조건을 만족하면 총합에 더하기
            }
        }

        // 총합 출력
        System.out.println(sum);

        scanner.close(); // 스캐너 닫기
    }
}