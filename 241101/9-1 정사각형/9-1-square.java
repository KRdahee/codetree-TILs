import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // 숫자 시작값
        int startNum;

        for (int i = 0; i < n; i++) {
            // 각 행의 시작 숫자 결정
            startNum = 9 - (i % 9);
            for (int j = 0; j < n; j++) {
                // 숫자 출력
                System.out.print(startNum);
                startNum--;
                if (startNum < 1) {
                    startNum = 9; // 1보다 작아지면 9로 리셋
                }
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}