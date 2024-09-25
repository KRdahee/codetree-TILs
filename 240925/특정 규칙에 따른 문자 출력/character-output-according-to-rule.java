/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력받기
        int n = scanner.nextInt();
        
        // 첫 번째 부분: 위쪽 삼각형
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            // '@' 출력
            for (int j = 0; j <= i; j++) {
                System.out.print(" @");
            }
            System.out.println();
        }
        
        // 두 번째 부분: 아래쪽 삼각형
        for (int i = 0; i < n - 1; i++) {
            // 공백 출력
            for (int j = 0; j < i + 1; j++) {
                System.out.print("");
            }
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" @");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        scanner.close();
    }
}*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 모양에 맞게 윗쪽 별을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }
        
        // 모양에 맞게 아랫쪽 별을 출력합니다.
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }
    }
}