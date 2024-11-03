import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 N 입력 받기
        int N = scanner.nextInt();
        
        // N에 따라 숫자 출력하기
        for (int i = 0; i < N; i++) {
            // 현재 줄의 시작 숫자 출력
            for (int j = N - i; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // 줄바꿈
        }
        
        scanner.close();
    }
}