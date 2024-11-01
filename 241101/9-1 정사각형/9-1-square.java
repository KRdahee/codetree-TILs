import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            // 각 행의 시작 숫자를 결정합니다.
            int startNum = (9 - (i % 9) + 9) % 9; // 9에서 시작
            if (startNum == 0) startNum = 9; // 0이면 9로 설정
            
            for (int j = 0; j < n; j++) {
                System.out.print(startNum);
                startNum--;
                if (startNum < 1) { // 1보다 작으면 9로 리셋
                    startNum = 9;
                }
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}