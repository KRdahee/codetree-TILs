import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n을 입력받기
        int n = sc.nextInt();
        
        // 1 이상 n 이하의 소수를 출력
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // i가 소수인지 확인하는 변수
            
            // i가 소수인지 판별 (2부터 sqrt(i)까지 나누어 보자)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {  // i가 j로 나누어 떨어지면 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            
            // 소수일 경우 출력
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}