import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while (a <= b) {
            System.out.print(a + " ");
            if (a % 2 == 0) {
                // 짝수인 경우: 3만큼 증가
                a += 3;
            } else {
                // 홀수인 경우: 2배가 됨
                a *= 2;
            }
        }
        
        scanner.close();
    }
}