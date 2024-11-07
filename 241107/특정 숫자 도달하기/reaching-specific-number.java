import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10개의 숫자를 입력받습니다.
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        int count = 0;
        
        // 250 이상인 수가 나오기 전까지 합계와 평균을 구합니다.
        for (int i = 0; i < 10; i++) {
            if (numbers[i] >= 250) {
                break; // 250 이상의 숫자가 나오면 그 전까지만 계산
            }
            sum += numbers[i];
            count++;
        }
        
        // 합계와 평균을 계산합니다.
        double average = (count > 0) ? (double) sum / count : 0;
        
        // 평균을 반올림하여 소수 첫째 자리까지 출력
        System.out.printf("%d %.1f\n", sum, Math.round(average * 10.0) / 10.0);
    }
}