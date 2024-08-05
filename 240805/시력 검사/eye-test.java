import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시력 a와 b 입력받기
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        // 시력에 따라 출력 결정
        if (a >= 1.0 && b >= 1.0) {
            System.out.println("High");
        } else if (a >= 0.5 && b >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }

        scanner.close();
    }
}