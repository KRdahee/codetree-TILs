import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력 받기
        int n = scanner.nextInt();
        
        // 숫자를 출력하기 위한 변수
        int num = 1;

        // n x n 사각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num);
                num++;
                // 9를 넘으면 1로 리셋
                if (num > 9) {
                    num = 1;
                }
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}