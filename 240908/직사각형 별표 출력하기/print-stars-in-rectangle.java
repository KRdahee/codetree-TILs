import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 직사각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
                if (j < m - 1) {
                    System.out.print(" "); // 별표 사이에 공백 추가
                }
            }
            System.out.println(); // 한 행이 끝난 후 줄 바꿈
        }
        
        scanner.close();
    }
}