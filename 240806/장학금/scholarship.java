import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 중간고사와 기말고사 점수 입력
        int midterm = sc.nextInt();
        int finalExam = sc.nextInt();
        
        // 장학금 변수 초기화
        int scholarship = 0;
        
        // 중간고사 점수가 90점 이상인 경우
        if (midterm >= 90) {
            // 기말고사 점수에 따라 장학금 결정
            if (finalExam >= 95) {
                scholarship = 100000;
            } else if (finalExam >= 90) {
                scholarship = 50000;
            }
        }
        
        // 장학금 출력
        System.out.println(scholarship);
    }
}