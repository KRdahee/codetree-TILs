import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 a와 b를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 현재 값을 a로 초기화합니다.
        int current = a;
        
        // 현재 값이 b보다 작거나 같을 때까지 반복합니다.
        while (current <= b) {
            // 현재 값이 짝수인 경우 출력합니다.
            System.out.print(current);
            
            // 현재 값이 b가 아니면 공백을 추가합니다.
            if (current < b) {
                System.out.print(" ");
            }
            
            // 현재 값을 2씩 증가시킵니다 (다음 짝수로 이동).
            current += 2;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}