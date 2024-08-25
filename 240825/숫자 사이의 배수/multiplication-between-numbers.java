import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 a와 b를 입력받음
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int sum = 0; // 합을 저장할 변수
        int count = 0; // 5 또는 7의 배수 개수를 세기 위한 변수

        // a부터 b까지 반복
        for (int i = a; i <= b; i++) {
            // 5 또는 7의 배수인지 확인
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i; // 합에 더하기
                count++; // 개수 증가
            }
        }

        // 평균을 계산 (0으로 나누는 것을 방지하기 위해 count가 0인지 확인)
        double average = count > 0 ? (double) sum / count : 0;

        // 합과 평균 출력 (평균은 소수 첫째 자리까지 반올림)
        System.out.printf("%d %.1f%n", sum, Math.round(average * 10.0) / 10.0);

        scanner.close(); // 스캐너 닫기
    }
}