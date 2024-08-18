import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // n부터 1까지 공백으로 구분하여 출력합니다.
        for (int i = n; i >= 1; i--) {
            if (i < n) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}