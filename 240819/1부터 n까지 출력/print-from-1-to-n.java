import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 1부터 n까지 숫자를 공백으로 구분하여 출력합니다.
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}