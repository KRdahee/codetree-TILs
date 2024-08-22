import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받는다.
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 정수 n을 입력받는다.
        int n = scanner.nextInt();
        
        // n부터 100까지의 합을 계산하기 위한 변수
        int sum = 0;
        
        // n부터 100까지의 숫자를 반복하며 합을 계산한다.
        for (int i = n; i <= 100; i++) {
            sum += i;
        }
        
        // 결과를 출력한다.
        System.out.println(sum);
        
        // Scanner 객체를 닫아 리소스를 반환한다.
        scanner.close();
    }
}