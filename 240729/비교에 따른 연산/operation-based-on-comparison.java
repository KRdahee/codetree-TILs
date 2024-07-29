import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 두 개의 정수 a와 b 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a가 b보다 크면 두 수의 곱을 출력
        if (a > b) {
            System.out.println(a * b);
        } else {
            // a가 b보다 작거나 같으면 b를 a로 나눈 몫을 출력
            if (a != 0) { // a가 0일 경우 나누기 연산 방지
                System.out.println(b / a);
            } else {
                // a가 0일 때 처리 (예: division by zero 예외 처리)
                System.out.println("Undefined"); // 또는 적절한 메시지 출력
            }
        }

        sc.close(); // Scanner 자원 반환
    }
}