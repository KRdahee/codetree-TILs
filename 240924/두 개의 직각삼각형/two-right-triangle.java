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
        
        // 별표 출력
        for (int i = 0; i < n; i++) {
            // 왼쪽 별 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*"); // 왼쪽 삼각형의 별
            }
            // 공백 출력
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" "); // 가운데 공백
            }
            // 오른쪽 별 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*"); // 오른쪽 삼각형의 별
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}