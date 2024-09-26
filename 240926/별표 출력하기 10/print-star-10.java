import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;  // 테스트 케이스로 5를 사용합니다.

        // 상단 부분 출력
        for (int i = 0; i < n; i++) {
            int starCount;
            if (i % 2 == 0) { // i가 짝수인 경우
                starCount = 1 + (i / 2);
            } else { // i가 홀수인 경우
                starCount = n - (i - 1) / 2;
            }

            // 별 출력
            for (int j = 0; j < starCount; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈
        }

        // 하단 부분 출력 (상단과 대칭)
        for (int i = n - 1; i >= 0; i--) {
            int starCount;
            if (i % 2 == 0) { // i가 짝수인 경우
                starCount = 1 + (i / 2);
            } else { // i가 홀수인 경우
                starCount = n - (i - 1) / 2;
            }

            // 별 출력
            for (int j = 0; j < starCount; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈
        }

        scanner.close();
    }
}