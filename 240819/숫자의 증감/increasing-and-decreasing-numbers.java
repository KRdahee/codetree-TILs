import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 문자 c와 숫자 n을 입력받습니다.
        char c = scanner.next().charAt(0);
        int n = scanner.nextInt();
        
        // Scanner 객체를 닫습니다.
        scanner.close();
        
        // 문자 c의 값에 따라 출력 형식을 결정합니다.
        if (c == 'A') {
            // c가 'A'일 경우, 1부터 n까지 숫자를 증가 순서로 출력합니다.
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(" "); // 마지막 숫자 뒤에는 공백을 추가하지 않습니다.
                }
            }
        } else if (c == 'D') {
            // c가 'D'일 경우, n부터 1까지 숫자를 감소 순서로 출력합니다.
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" "); // 마지막 숫자 뒤에는 공백을 추가하지 않습니다.
                }
            }
        }
        // 입력이 'A' 또는 'D'가 아니면 아무것도 출력하지 않습니다.
    }
}