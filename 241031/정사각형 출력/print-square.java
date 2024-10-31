//public class Main {
//    public static void main(String[] args) {
//        int cnt = 1;
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(cnt);
//                cnt++;
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력 받기
        int n = scanner.nextInt();
        
        // n x n 배열 생성 및 출력
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                // 각 행의 첫 번째 숫자는 i*n + j
                System.out.print((i * n + j) + " ");
            }
            System.out.println(); // 다음 줄로 이동
        }
        
        scanner.close();
    }
}