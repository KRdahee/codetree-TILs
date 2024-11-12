import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10개의 정수를 입력받기
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 세 번째, 다섯 번째, 열 번째 정수의 합 구하기
        int sum = numbers[2] + numbers[4] + numbers[9];
        
        // 합을 출력
        System.out.println(sum);
    }
}
