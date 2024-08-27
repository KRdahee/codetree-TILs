import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;  // 나눗셈 횟수를 기록할 변수
        int divisor = 1; // 현재 나누는 숫자 초기화
        int quotient = n; // 초기 몫은 n
        
        // 몫이 1 이하가 될 때까지 나눗셈을 반복
        while (quotient > 3) {
            divisor++; // 나누는 숫자 증가
            quotient = n / divisor; // 몫 계산
            count++; // 나눗셈 횟수 증가
        }

        // 마지막으로 나눗셈을 시도한 숫자 출력
        System.out.println(divisor);
    }
}