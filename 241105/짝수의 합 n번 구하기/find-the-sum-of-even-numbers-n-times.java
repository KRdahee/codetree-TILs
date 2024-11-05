import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수 n 입력받기
        int n = sc.nextInt();
        
        // 각 테스트 케이스마다 처리
        for (int i = 0; i < n; i++) {
            // a와 b 입력받기
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = 0;
            
            // a부터 b까지 반복하면서 짝수만 더하기
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) { // 짝수일 경우
                    sum += j;
                }
            }
            
            // 결과 출력
            System.out.println(sum);
        }

        // Scanner 객체 닫기
        sc.close();
    }
}