import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 a 입력받기
        int a = scanner.nextInt();

        // a가 10 이상 20 이하인지 확인
        if (a >= 10 && a <= 20) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}