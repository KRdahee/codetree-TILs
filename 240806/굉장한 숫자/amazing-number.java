import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 n 값을 입력받습니다.
        int n = scanner.nextInt();

        // Scanner 객체를 닫습니다.
        scanner.close();

        // 굉장한 숫자 판별
        if ((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}