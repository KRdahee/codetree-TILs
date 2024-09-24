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
        
        // 위쪽 부분: 1부터 n까지
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
            System.out.println(); // 한 줄 추가로 띄움
        }

        // 아래쪽 부분: n-1부터 1까지
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
            System.out.println(); // 한 줄 추가로 띄움
        }

        scanner.close();
    }
}