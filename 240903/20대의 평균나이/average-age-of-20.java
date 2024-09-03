import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0; // 나이의 합계
        int count = 0;  // 나이의 개수

        while (true) {
            int age = scanner.nextInt(); // 나이 입력 받기

            // 20대가 아닌 나이일 경우 루프 종료
            if (age < 20 || age > 29) {
                break;
            }

            sum += age; // 나이의 합계에 추가
            count++; // 나이의 개수 증가
        }

        // 나이의 평균 계산 및 출력
        if (count > 0) {
            double average = sum / count;
            System.out.printf("%.2f\n", average); // 소수점 둘째 자리까지 출력
        } else {
            System.out.println("No ages provided."); // 아무 나이도 제공되지 않은 경우
        }

        scanner.close(); // 자원 정리
    }
}