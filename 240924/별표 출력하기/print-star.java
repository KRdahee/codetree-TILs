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
        
        // 패턴 출력
        // 첫 번째 부분: 위로 올라가는 부분
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄 바꿈
        }

        // 두 번째 부분: 아래로 내려가는 부분
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}