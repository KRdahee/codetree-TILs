import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 a와 b를 공백으로 구분하여 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 큰 수에서 작은 수를 빼기 위해 Math.max와 Math.min 사용
        int difference = Math.max(a, b) - Math.min(a, b);

        // 차 출력
        System.out.println(difference);

        sc.close(); // Scanner 자원 반환
    }
}