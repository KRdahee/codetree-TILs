import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // 0 이상 200 이하의 수들의 합
        int count = 0; // 0 이상 200 이하의 수들의 개수

        // 10개의 정수를 입력받음
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt(); // 정수 입력받기

            // 0 이상 200 이하인지 확인
            if (number >= 0 && number <= 200) {
                sum += number; // 합에 더하기
                count++; // 개수 증가
            }
        }

        // 평균 계산 (0으로 나누는 것을 방지하기 위해 count가 0인지 확인)
        double average = count > 0 ? (double) sum / count : 0;

        // 합과 평균 출력 (평균은 소수 첫째 자리까지 반올림)
        System.out.printf("%d %.1f%n", sum, Math.round(average * 10.0) / 10.0);

        scanner.close(); // 스캐너 닫기
    }
}