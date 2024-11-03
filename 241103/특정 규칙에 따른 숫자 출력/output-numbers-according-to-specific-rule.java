import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 n 입력 받기
        int n = scanner.nextInt();
        
        // 숫자를 출력할 값
        int number = 1;
        
        // n에 따라 숫자 출력하기
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 숫자 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print(number + " ");
                number++;
                if (number > 9) {
                    number = 1; // 숫자가 9를 넘으면 다시 1로
                }
            }
            System.out.println(); // 줄바꿈
        }
        
        scanner.close();
    }
}