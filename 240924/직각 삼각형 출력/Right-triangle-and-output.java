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
        
        // 삼각형 출력
        for (int i = 1; i <= n; i++) {
            // 현재 줄에 출력할 별의 개수
            int starsCount = 2 * i - 1;
            for (int j = 0; j < starsCount; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
        
        scanner.close();
    }
}