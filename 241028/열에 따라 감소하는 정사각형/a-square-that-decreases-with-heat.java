import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력 받기
        int n = scanner.nextInt();
        
        // 정사각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}