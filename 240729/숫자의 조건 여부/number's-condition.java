import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        int a = sc.nextInt();
        
        // a가 113 이상이면 1을 출력, 그렇지 않으면 0을 출력
        if (a >= 113) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        sc.close(); // Scanner 자원 반환
    }
}