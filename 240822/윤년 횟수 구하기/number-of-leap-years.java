import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n값을 입력받음
        int n = scanner.nextInt();
        
        // 윤년의 수를 저장할 변수 초기화
        int leapYearCount = 0;
        
        // 1년부터 n년까지 순회하면서 윤년을 계산
        for (int year = 1; year <= n; year++) {
            // 윤년 조건 확인
            // 1. 4로 나누어 떨어지는 해인지 확인
            // 2. 100으로 나누어 떨어지지만 400으로 나누어 떨어지지 않는 해는 평년
            // 3. 400으로 나누어 떨어지면 윤년
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    leapYearCount++; // 윤년일 경우 윤년 수를 증가
                }
            }
        }
        
        // 윤년의 총 개수를 출력
        System.out.println(leapYearCount);
        
        // Scanner 객체의 자원을 해제하여 메모리 누수를 방지
        scanner.close();
    }
}