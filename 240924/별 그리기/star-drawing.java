import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n을 입력받음
        int n = scanner.nextInt();
        
        // n의 범위 확인
        if (n < 1 || n > 100) {
            System.out.println("n은 1 이상 100 이하이어야 합니다.");
            return;
        }

        // 다이아몬드의 위쪽 부분
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // 한 칸의 공백
            }
            // 별 출력
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }

        // 다이아몬드의 아래쪽 부분
        for (int i = n - 2; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // 한 칸의 공백
            }
            // 별 출력
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}