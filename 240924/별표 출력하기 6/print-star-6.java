import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n을 입력받음
        int n = scanner.nextInt();
        
        // n의 범위 확인
        if (n < 1 || n > 10) {
            System.out.println("n은 1 이상 10 이하이어야 합니다.");
            return;
        }

        // 위쪽 부분: n부터 1까지
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // 두 칸의 공백
            }
            // 별 출력
            for (int j = 0; j < (2 * n - 2 * i - 1); j++) {
                System.out.print("* "); // 별과 한 칸의 공백
            }
            System.out.println(); // 줄 바꿈
        }

        // 아래쪽 부분: 1부터 n까지
        for (int i = 1; i < n; i++) {
            // 공백 출력
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("  "); // 두 칸의 공백
            }
            // 별 출력
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("* "); // 별과 한 칸의 공백
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}