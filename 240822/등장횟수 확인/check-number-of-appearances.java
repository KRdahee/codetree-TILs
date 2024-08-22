import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);
        
        // 짝수의 수를 저장할 변수 초기화
        int evenCount = 0;
        
        // 5개의 숫자를 입력받고 짝수 개수를 세기
        for (int i = 0; i < 5; i++) {
            // 숫자를 입력받음
            int number = scanner.nextInt();
            
            // 짝수 여부 확인
            if (number % 2 == 0) {
                evenCount++; // 짝수일 경우 짝수 개수를 증가
            }
        }
        
        // 짝수의 총 개수를 출력
        System.out.println(evenCount);
        
        // Scanner 자원 해제
        scanner.close();
    }
}