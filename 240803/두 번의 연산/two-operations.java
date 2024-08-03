import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 a를 입력받음
        int a = sc.nextInt();
        
        // a가 홀수라면 3을 더해줍니다
        if (a % 2 != 0) {
            a = a + 3;
        }
        
        // 최종적으로 a가 3의 배수라면 3으로 나누어줍니다
        if (a % 3 == 0) {
            a = a / 3;
        }
        
        // 결과 출력
        System.out.println(a);

        // Scanner 닫기
        sc.close();
    }
}