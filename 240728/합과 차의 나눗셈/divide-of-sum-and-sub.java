import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 괄호를 사용하여 원하는 연산 순서를 명확히 합니다.
        // 전체 식을 double로 변환하여 소수점 이하 두 자리까지 출력합니다.
        double result = (double)(a + b) / (a - b);

        System.out.printf("%.2f", result);

        sc.close(); // Scanner 자원 반환
    }
}