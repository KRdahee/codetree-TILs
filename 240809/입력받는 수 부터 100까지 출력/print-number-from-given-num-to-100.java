import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 n 입력 받기
        int n = scanner.nextInt();

        // n부터 100까지의 숫자를 공백으로 구분하여 출력
        for (int i = n; i <= 100; i++) {
            // 마지막 숫자인 경우에는 공백을 추가하지 않음
            if (i > n) {
                System.out.print(" ");
            }
            System.out.print(i);
        }

        // 줄 바꿈
        System.out.println();

        // 자원 해제
        scanner.close();
    }
}