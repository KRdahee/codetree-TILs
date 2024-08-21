import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 큰 수와 작은 수를 결정합니다.
        int start = Math.max(a, b);
        int end = Math.min(a, b);

        // 큰 수부터 작은 수까지 1씩 감소하며 출력합니다.
        for (int i = start; i >= end; i--) {
            System.out.print(i + " ");
        }

        // 스캐너를 닫습니다.
        scanner.close();
    }
}