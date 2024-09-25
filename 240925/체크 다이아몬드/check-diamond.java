import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력받기
        int n = scanner.nextInt();
        
        // 다이아몬드 모양 출력
        // 위쪽 부분
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // '*' 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 아래쪽 부분
        for (int i = n - 2; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            // '*' 출력
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}