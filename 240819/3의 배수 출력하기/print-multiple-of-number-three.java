import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 현재 값을 1로 초기화합니다.
        int current = 1;
        
        // 1부터 n까지 반복합니다.
        while (current <= n) {
            // 현재 값이 3의 배수인지 확인합니다.
            if (current % 3 == 0) {
                // 현재 값을 출력합니다.
                System.out.print(current);
                
                // 마지막 값이 아닐 경우 공백을 추가합니다.
                if (current + 3 <= n) {
                    System.out.print(" ");
                }
            }
            // 현재 값을 1씩 증가시킵니다.
            current++;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}