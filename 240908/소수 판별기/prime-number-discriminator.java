import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        // 소수 판별
        boolean isPrime = isPrime(n);
        
        // 결과 출력
        if (isPrime) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
        
        scanner.close();
    }
    
    // 소수 판별 메소드
    private static boolean isPrime(int n) {
        if (n <= 1) return false; // 1 이하의 숫자는 소수가 아님
        if (n == 2) return true;  // 2는 소수
        if (n % 2 == 0) return false; // 2를 제외한 짝수는 소수가 아님
        
        // 2부터 √n까지의 수로 나누어봄
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        
        return true; // 모든 검사를 통과하면 소수
    }
}