import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        
        // 10개의 숫자를 입력받고 홀수 개수를 세기
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                oddCount++;
            }
        }
        
        // 홀수의 개수 출력
        System.out.println(oddCount);
        
        // Scanner 자원 해제
        scanner.close();
    }
}

 
//a부터 b까지의 숫자들 중 짝수의 개수를 세는 프로그램
//0을 초기값으로 갖는 cnt라는 변수를 활용하여, for 안에서 i값이 짝수일 때만 cnt값을 1씩 증가하는 식으로 진행해볼 수 있습니다. 
//cnt를 꼭 0으로 초기화 하고 진행해야 함에 유의합니다.
//public class Main {
//    public static void main(String[] args) {
//        int a = 3, b = 8;
//        int cnt = 0;
//
//        for (int i = a; i <= b; i++) {
//           if (i % 2 == 0) {
//               cnt++;
//            }
//        }
//
//        System.out.println(cnt);
//    }
//}