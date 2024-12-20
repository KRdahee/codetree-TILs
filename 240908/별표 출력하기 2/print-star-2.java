import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        // 별표 출력
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (j < i - 1) {
                    System.out.print(" "); // 별표 사이에 공백 추가
                }
            }
            System.out.println(); // 한 행이 끝난 후 줄 바꿈
        }
        
        scanner.close();
    }
}