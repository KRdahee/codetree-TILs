import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt();
        
        // N이 2의 거듭제곱 수라는 가정 하에
        int x = 0;
        
        // N을 2로 나누며 거듭제곱 수를 찾기
        while (N > 1) {
            N /= 2;
            x++;
        }
        
        // 결과 출력
        System.out.println(x);
        
        scanner.close();
    }
}