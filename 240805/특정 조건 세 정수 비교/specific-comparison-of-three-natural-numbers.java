import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 a, b, c 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // 첫 번째 조건: a가 세 정수의 최솟값과 일치하는지 확인
        int min = Math.min(a, Math.min(b, c));
        int firstCondition = (a == min) ? 1 : 0;
        
        // 두 번째 조건: 세 개의 수가 모두 같은지 확인
        int secondCondition = (a == b && b == c) ? 1 : 0;
        
        // 결과 출력
        System.out.println(firstCondition + " " + secondCondition);

        scanner.close();
    }
}