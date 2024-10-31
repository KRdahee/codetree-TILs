import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력 받기
        int n = scanner.nextInt();
        
        // n x n 배열 생성
        int[][] array = new int[n][n];
        
        // 배열 값 채우기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                array[i - 1][j - 1] = i * j;
            }
        }

        // 좌우 반전 출력
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}