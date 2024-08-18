import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 a와 b를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // b부터 a까지 1씩 감소하며 공백으로 구분하여 출력합니다.
        for (int i = b; i >= a; i--) {
            if (i < b) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}