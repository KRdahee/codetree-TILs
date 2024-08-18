import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 b와 a를 입력받습니다.
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        
        // b 이하 a 이상의 모든 홀수를 내림차순으로 출력합니다.
        for (int i = b; i >= a; i--) {
            if (i % 2 == 1) {  // 홀수인 경우
                if (i < b) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}