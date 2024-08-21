import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // a가 자연수인지 확인합니다.
        if (a > 0) {
            // a를 b번 반복하여 출력합니다.
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        }
        
        // 스캐너를 닫습니다.
        scanner.close();
    }
}