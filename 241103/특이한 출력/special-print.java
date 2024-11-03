import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n 입력 받기
        int n = scanner.nextInt();
        
        // 좌표 출력하기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 좌표 출력
                System.out.print("(" + i + ", " + j + ") ");
                
                // i + j가 4의 배수일 경우 줄 바꿈
                if ((i + j) % 4 == 0) {
                    System.out.println(); // 줄바꿈
                }
            }
        }
        
        scanner.close();
    }
}