import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 a와 b를 공백으로 구분하여 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // b와 a의 차이 출력
        System.out.println(b - a);

        sc.close(); // Scanner 자원 반환
    }
}