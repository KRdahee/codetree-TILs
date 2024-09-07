import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        int cnt = 0; // 연산 횟수 카운트
        
        // n이 1000 이상이 될 때까지 반복
        while (n < 1000) {
            if (n % 2 == 0) {
                // n이 짝수일 때
                n = n * 3 + 1;
            } else {
                // n이 홀수일 때
                n = n * 2 + 2;
            }
            cnt++;
        }
        
        // 결과 출력
        System.out.println(cnt);
        
        scanner.close();
    }
}