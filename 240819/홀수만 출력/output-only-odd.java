import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 a와 b를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // a 이상 b 이하의 홀수를 출력합니다.
        for (int i = a; i <= b; i += 2) {
            if (i > a) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}