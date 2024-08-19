import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 a와 n을 입력받습니다.
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Scanner 객체를 닫습니다.
        scanner.close();
        
        // n번 반복하여 a에 n을 더한 결과를 출력합니다.
        for (int i = 0; i < n; i++) {
            a += n;  // a에 n을 더합니다.
            System.out.println(a);  // 결과를 출력합니다.
        }
    }
}