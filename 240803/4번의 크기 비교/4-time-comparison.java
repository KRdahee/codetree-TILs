import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        // 입력 받은 후 Scanner 객체를 닫습니다.
        scanner.close();

        // a가 b보다 같거나 큰지
        System.out.println(a > b ? 1 : 0);

        // a가 b보다 큰지
        System.out.println(a > c ? 1 : 0);

        // b가 a보다 같거나 큰지
        System.out.println(a > d ? 1 : 0);

        // b가 a보다 큰지
        System.out.println(a > e ? 1 : 0);
    }
}