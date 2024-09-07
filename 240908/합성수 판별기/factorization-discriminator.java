import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        boolean isComposite = false;
        
        // 2부터 n-1까지의 모든 정수로 n이 나누어지는지 확인
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        
        // 결과 출력
        if (isComposite) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
        
        scanner.close();
    }
}