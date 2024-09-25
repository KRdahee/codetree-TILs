import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력받기
        int n = scanner.nextInt();
        
        // 첫 번째 부분: 위쪽 삼각형
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            // '@' 출력
            for (int j = 0; j <= i; j++) {
                System.out.print(" @");
            }
            System.out.println();
        }
        
        // 두 번째 부분: 아래쪽 삼각형
        for (int i = 0; i < n - 1; i++) {
            // 공백 출력
            for (int j = 0; j < i + 1; j++) {
                System.out.print("");
            }
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" @");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        scanner.close();
    }
}