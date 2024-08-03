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

        // 첫 번째 줄에 a가 b보다 크다면 1을, 크지 않다면 0을 출력합니다.
        System.out.println(a > b ? 1 : 0);

        // 두 번째 줄에 a가 c보다 크다면 1을, 크지 않다면 0을 출력합니다.
        System.out.println(a > c ? 1 : 0);

        // 세 번째 줄에 a가 d보다 크다면 1을, 크지 않다면 0을 출력합니다.
        System.out.println(a > d ? 1 : 0);

        // 네 번째 줄에 a가 e보다 크다면 1을, 크지 않다면 0을 출력합니다.
        System.out.println(a > e ? 1 : 0);
    }
}