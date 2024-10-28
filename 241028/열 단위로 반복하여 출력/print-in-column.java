import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력 받기
        int n = scanner.nextInt();
        
        // n의 값에 따른 숫자 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i); // i를 출력
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}