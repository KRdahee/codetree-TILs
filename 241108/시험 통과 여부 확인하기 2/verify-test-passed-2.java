import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 학생 수 입력
        int studentCount = scanner.nextInt();
        
        int passCount = 0;  // 통과한 학생 수를 세는 변수
        
        // 학생들의 점수를 하나씩 처리
        for (int i = 0; i < studentCount; i++) {
            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            int score3 = scanner.nextInt();
            int score4 = scanner.nextInt();
            
            // 평균 계산
            double average = (score1 + score2 + score3 + score4) / 4.0;
            
            // 평균이 60 이상이면 pass, 아니면 fail
            if (average >= 60) {
                System.out.println("pass");
                passCount++;  // 통과한 학생 수 증가
            } else {
                System.out.println("fail");
            }
        }
        
        // 최종적으로 통과한 학생 수 출력
        System.out.println(passCount);
    }
}