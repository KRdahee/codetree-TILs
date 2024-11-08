import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;  // 2의 배수 개수를 세는 변수
        int sum = 0;    // 2의 배수 합을 구하는 변수
        
        // 10개의 정수를 입력받음
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            
            // 0이 입력되면 종료
            if (num == 0) {
                break;
            }
            
            // 2의 배수인 경우
            if (num % 2 == 0) {
                count++;  // 2의 배수 개수 증가
                sum += num;  // 2의 배수 합에 더함
            }
        }
        
        // 2의 배수 개수와 합 출력
        System.out.println(count + " " + sum);
    }
}