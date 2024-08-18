import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 자연수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 현재 값을 n으로 초기화합니다.
        int current = n;
        
        // 현재 값이 1보다 크거나 같을 때까지 반복합니다.
        while (current >= 1) {
            // 현재 값을 출력합니다.
            System.out.print(current);
            
            // 현재 값이 1이 아니면 공백을 추가합니다.
            if (current > 1) {
                System.out.print(" ");
            }
            
            // 현재 값을 1씩 감소시킵니다.
            current--;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}