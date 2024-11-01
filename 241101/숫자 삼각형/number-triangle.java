import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // n까지의 삼각형 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // 숫자 출력
            }
            System.out.println(); // 각 줄의 끝에서 줄 바꿈
        }
    }
}