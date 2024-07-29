import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 한 변의 길이 n을 입력 받기
        int n = sc.nextInt();
        
        // 정사각형의 넓이 계산
        int area = n * n;
        
        // 정사각형의 넓이 출력
        System.out.println(area);
        // n이 5보다 작으면 "tiny" 출력
        if (n < 5) {
            System.out.println("tiny");
        }
        
        
        sc.close(); // Scanner 자원 반환
    }
}