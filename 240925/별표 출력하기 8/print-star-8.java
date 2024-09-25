import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력받기
        int n = scanner.nextInt();
        
        // 별표 출력
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // 홀수 번째 줄 (0, 2, 4, ...)에는 '*' 하나 출력
                System.out.println("*");
            } else {
                // 짝수 번째 줄 (1, 3, ...)에는 i + 1 개의 '*' 출력
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}