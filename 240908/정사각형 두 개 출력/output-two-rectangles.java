import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        // 두 개의 정사각형 출력
        for (int i = 0; i < n; i++) {
            // 첫 번째 정사각형
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 공백 추가
            System.out.print(" ");
            System.out.println();
            // 두 번째 정사각형
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
        
        scanner.close();
    }
}