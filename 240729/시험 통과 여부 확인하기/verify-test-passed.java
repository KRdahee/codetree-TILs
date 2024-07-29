import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        int score = sc.nextInt();
        
        // 점수가 80 이상인지 확인
        if (score >= 80) {
            System.out.println("pass");
        } else {
            // 부족한 점수 계산
            int neededScore = 80 - score;
            System.out.println(neededScore + " more score");
        }
        
        sc.close(); // Scanner 자원 반환
    }
}