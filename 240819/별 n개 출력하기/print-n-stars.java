import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 현재 줄 번호를 1로 초기화합니다.
        int current = 1;
        
        // 현재 줄 번호가 n 이하일 때까지 반복합니다.
        while (current <= n) {
            // '*'을 출력하고 줄바꿈을 합니다.
            System.out.println("*");
            // 현재 줄 번호를 1씩 증가시킵니다.
            current++;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}