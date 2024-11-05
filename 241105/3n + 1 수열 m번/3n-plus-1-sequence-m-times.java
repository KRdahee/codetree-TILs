import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // m: 테스트 케이스의 개수
        int m = sc.nextInt();
        
        // 각 테스트 케이스마다 결과 출력
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();  // n 값 입력
            int count = 0;  // 반복 횟수

            // n이 1이 될 때까지 반복
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;  // n이 짝수일 경우 2로 나눈다
                } else {
                    n = 3 * n + 1;  // n이 홀수일 경우 3을 곱하고 1을 더한다
                }
                count++;  // 연산 횟수 증가
            }
            
            // 해당 n에 대한 연산 횟수 출력
            System.out.println(count);
        }

        sc.close();
    }
}