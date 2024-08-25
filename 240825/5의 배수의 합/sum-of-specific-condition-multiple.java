import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // a와 b 중 작은 값과 큰 값을 구함
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0; // 합을 저장할 변수

        // start부터 end까지 반복
        for (int i = start; i <= end; i++) {
            // 5의 배수인지 확인
            if (i % 5 == 0) {
                sum += i; // 합에 더하기
            }
        }

        // 총합 출력
        System.out.println(sum);

        scanner.close(); // 스캐너 닫기
    }
}