import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 b와 a를 입력받습니다.
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        
        // 현재 값을 b로 초기화합니다.
        int current = b;
        
        // 현재 값이 a보다 크거나 같을 때까지 반복합니다.
        while (current >= a) {
            // 현재 값이 짝수인 경우 출력합니다.
            if (current % 2 == 0) {
                // 현재 값을 출력합니다.
                System.out.print(current);
                
                // 마지막 값이 아니면 공백을 추가합니다.
                if (current > a) {
                    System.out.print(" ");
                }
            }
            
            // 현재 값을 1씩 감소시킵니다.
            current--;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}