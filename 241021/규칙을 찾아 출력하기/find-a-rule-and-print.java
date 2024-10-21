import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 첫 번째 행, 마지막 행 또는 대각선에 별을 출력
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // 별과 별 사이에 공백 추가
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}