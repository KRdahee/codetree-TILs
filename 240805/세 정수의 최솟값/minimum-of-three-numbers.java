import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 a, b, c 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // 삼항 연산자를 사용하여 최솟값 찾기
        int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        
        // 최솟값 출력
        System.out.println(min);

        scanner.close();
    }
}