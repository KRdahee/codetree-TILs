import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        // 별표 출력
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                // 각 그룹의 별표 출력
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                // 그룹 사이 공백 추가
                if (j < i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 한 행이 끝난 후 줄 바꿈
        }
        
        scanner.close();
    }
}