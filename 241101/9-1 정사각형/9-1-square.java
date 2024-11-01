import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int currentNum;
        
        for (int i = 0; i < n; i++) {
            currentNum = 9 - (i % 9); // 행에 따라 시작 숫자 결정
            for (int j = 0; j < n; j++) {
                System.out.print(currentNum);
                currentNum--;
                if (currentNum < 1) { // 1보다 작으면 9로 리셋
                    currentNum = 9;
                }
            }
            System.out.println(); // 각 행의 끝에서 줄 바꿈
        }
    }
}