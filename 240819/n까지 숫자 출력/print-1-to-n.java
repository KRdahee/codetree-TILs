import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 자연수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 현재 값을 1로 초기화합니다.
        int current = 1;
        
        // 현재 값이 n보다 작거나 같을 때까지 반복합니다.
        while (current <= n) {
            // 마지막 숫자 이외에는 공백을 추가합니다.
            if (current > 1) {
                System.out.print(" ");
            }
            // 현재 값을 출력합니다.
            System.out.print(current);
            // 현재 값을 1씩 증가시킵니다.
            current++;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}