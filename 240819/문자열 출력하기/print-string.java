import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 입력받은 n의 값이 1 이상 10 이하인지 확인합니다.
        if (n < 1 || n > 10) {
            System.out.println("입력 값이 범위를 벗어났습니다.");
            return;
        }
        
        // n번 만큼 "LeebrosCode"를 출력합니다.
        for (int i = 0; i < n; i++) {
            System.out.println("LeebrosCode");
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}