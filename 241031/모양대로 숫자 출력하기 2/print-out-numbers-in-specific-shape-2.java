import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력 받기
        int n = scanner.nextInt();
        
        // 짝수 숫자 배열
        int[] evens = {2, 4, 6, 8};

        // n x n 배열 생성 및 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                // j가 n보다 클 경우, 반복하여 숫자 출력
                System.out.print(evens[(i + j) % 4] + " ");
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}