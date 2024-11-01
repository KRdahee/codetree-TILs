import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int currentNumber = 1; // 현재 출력할 숫자

        // 1부터 n까지의 수에 대해 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                if (j < i) { // 마지막 숫자가 아닐 때만 공백 추가
                    System.out.print(" ");
                }
                currentNumber++; // 다음 숫자로 증가
            }
            System.out.println(); // 각 줄의 끝에서 줄 바꿈
        }
    }
}