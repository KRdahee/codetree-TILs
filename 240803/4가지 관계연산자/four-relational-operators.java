import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 정수를 입력받습니다.
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 각 관계 연산자의 결과를 정수로 변환하여 출력합니다.
        System.out.println(a > b ? 1 : 0);   // a가 b보다 작으면 1, 그렇지 않으면 0
        System.out.println(a >= b ? 1 : 0);  // a가 b보다 작거나 같으면 1, 그렇지 않으면 0
        System.out.println(a < b ? 1 : 0);   // a가 b보다 크면 1, 그렇지 않으면 0
        System.out.println(a <= b ? 1 : 0);  // a가 b보다 크거나 같으면 1, 그렇지 않으면 0

        // Scanner 닫기
        sc.close();
    }
}