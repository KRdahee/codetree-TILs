import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력 받기
        int n = scanner.nextInt();
        
        // 첫 홀수 시작 값
        int start = 11;
        
        // n x n 정사각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((start + 2 * (i + j)) + " "); // 홀수 계산
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}