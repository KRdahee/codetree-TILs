import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * " + j + " = " + (i * j));
                if (j < n) {
                    System.out.print(", "); // 마지막 항목이 아닐 때만 쉼표 추가
                }
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}