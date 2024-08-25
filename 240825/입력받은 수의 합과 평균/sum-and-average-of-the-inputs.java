import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 자연수 n을 입력받음
        int n = scanner.nextInt();

        int sum = 0; // 합계를 저장할 변수
        int[] numbers = new int[n]; // 입력받은 숫자들을 저장할 배열

        // n개의 정수를 입력받음
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // 정수 입력받기
            sum += numbers[i]; // 합계에 더하기
        }

        // 평균 계산
        double average = (double) sum / n;

        // 합계와 평균 출력 (평균은 소수 첫째 자리까지 반올림)
        System.out.printf("%d %.1f%n", sum, Math.round(average * 10.0) / 10.0);

        scanner.close(); // 스캐너 닫기
    }
}