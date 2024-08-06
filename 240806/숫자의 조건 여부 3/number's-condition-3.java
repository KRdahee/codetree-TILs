import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 a 값을 입력받습니다.
        int a = scanner.nextInt();

        // Scanner 객체를 닫습니다.
        scanner.close();

        // 조건을 확인하고 출력합니다.
        if (a % 13 == 0 || a % 19 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}