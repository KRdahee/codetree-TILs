import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 공약수를 찾기 위한 두 수
        int num1 = 1920;
        int num2 = 2880;
        
        // 최대공약수(GCD) 계산
        int gcd = findGCD(num1, num2);
        
        // 공약수가 범위 내에 존재하는지 확인
        boolean found = false;
        for (int i = a; i <= b; i++) {
            if (i % gcd == 0) {
                found = true;
                break;
            }
        }
        
        // 결과 출력
        System.out.println(found ? 1 : 0);
        
        scanner.close();
    }
    
    // 최대공약수(GCD) 계산을 위한 메소드
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}