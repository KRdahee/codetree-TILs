import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 자연수 n을 입력받습니다.
        int n = scanner.nextInt();
        
        // 입력받은 n의 배수 중에서 가장 작은 5개를 출력합니다.
        for (int i = 1; i <= 5; i++) {
            // i번째 배수를 계산합니다.
            int multiple = n * i;
            // 마지막 배수 이외의 숫자 사이에 공백을 추가합니다.
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(multiple);
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}