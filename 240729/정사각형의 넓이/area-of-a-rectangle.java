import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        int n = sc.nextInt();
        
        // 변수 nemo에 n 값 할당
        int nemo = n;

        // n의 5배를 출력
        System.out.println(n * 5);

        // 조건에 따른 출력
        if (nemo > 5) {
            System.out.println("tiny");
        }
        
        sc.close(); // Scanner 자원 반환
    }
}