import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = 9 - ((i + j) % 9); // 계산된 숫자
                System.out.print(num);
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}