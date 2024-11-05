import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 통해 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // start와 end 값을 입력받음
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // 카운트 변수 초기화
        int cnt = 0;
        
        // start부터 end까지 반복
        for (int i = start; i <= end; i++) {
            int sum = 0; // 약수의 개수를 셈
            
            // i의 약수를 찾는 부분 (1부터 i까지 검사)
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum++; // 나누어 떨어지면 sum을 증가시킴
                }
            }
            
            // sum이 3이면 약수가 정확히 3개라는 의미
            if (sum == 3) {
                cnt++; // 조건에 맞으면 cnt를 증가
            }
        }
        
        // 결과 출력
        System.out.printf("%d", cnt);
        
        // Scanner 객체 닫기
        sc.close();
    }
}