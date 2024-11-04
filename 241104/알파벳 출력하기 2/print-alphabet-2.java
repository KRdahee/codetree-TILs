import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        char currentChar = 'A'; // 시작하는 알파벳
        
        for (int i = 0; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // 두 개의 공백 출력
            }
            // 각 줄에 출력할 문자의 수는 N - i
            for (int j = 0; j < N - i; j++) {
                System.out.print(currentChar + " ");
                currentChar++; // 다음 알파벳으로 이동
                
                // Z 다음에 A로 돌아가기
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}