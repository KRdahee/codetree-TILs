import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a와 b 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 행과 열에 따라 출력
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i * j + " "); // i와 j의 곱을 출력
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}