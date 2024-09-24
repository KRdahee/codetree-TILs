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
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄 바꿈
        }

        // 아래쪽 부분: 2부터 n까지
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}