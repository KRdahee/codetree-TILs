import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받는다.
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 두 자연수를 입력받는다. 입력은 공백으로 구분된다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 입력받은 두 자연수 a와 b의 합을 계산한다.
        int sum = 0;
        
        // a부터 b까지의 합을 계산하기 위해 반복문을 사용한다.
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        
        // 결과를 출력한다.
        System.out.println(sum);
        
        // Scanner 객체를 닫아 리소스를 반환한다.
        scanner.close();
    }
}