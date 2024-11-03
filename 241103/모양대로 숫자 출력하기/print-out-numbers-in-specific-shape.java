import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n 입력 받기
        int n = scanner.nextInt();
        
        // n에 따라 숫자 출력하기
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 숫자 출력
            for (int j = n - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // 줄바꿈
        }
        
        scanner.close();
    }
}