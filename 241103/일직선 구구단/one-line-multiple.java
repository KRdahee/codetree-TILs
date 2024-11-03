import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n 입력 받기
        int n = scanner.nextInt();
        
        // n의 값에 따라 구구단 출력하기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        
        scanner.close();
    }
}