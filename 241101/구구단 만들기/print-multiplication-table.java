import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // b에서 a까지의 짝수 구구단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j -= 2) { // 짝수만 선택
                System.out.print(j + " * " + i + " = " + (j * i));
                if (j > a) {
                    System.out.print(" / "); // 마지막 짝수가 아닐 때만 '/' 추가
                }
            }
            System.out.println(); // 각 줄 끝에서 줄 바꿈
        }
    }
}