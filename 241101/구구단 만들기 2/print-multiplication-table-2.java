import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // 각 단수에 대해 구구단 출력
        for (int i = 2; i <= 8; i += 2) { // 2, 4, 6, 8
            for (int j = b; j >= a; j--) { // b부터 a까지 감소
                System.out.print(j + " * " + i + " = " + (j * i));
                if (j > a) {
                    System.out.print(" / "); // 마지막 단이 아닐 때만 '/' 추가
                }
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}