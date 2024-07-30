import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 두 개의 정수 a와 b 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 두 수 중 큰 값을 구하기
        int max = Math.max(a, b);

        // 구한 최대값 출력
        System.out.println(max);

        sc.close(); // Scanner 자원 반환
    }
}