import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        // 1번 과정: a가 짝수인지 확인하고 2로 나누기
        if (a % 2 == 0) {
            a = a / 2;
        }
        
        // 2번 과정: a가 홀수인지 확인하고 1을 더한 후 2로 나누기
        if (a % 2 != 0) {
            a = (a + 1) / 2;
        }
        
        // 최종 결과 출력
        System.out.println(a);
        
        // Scanner 닫기
        scanner.close();
    }
}