import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 점수를 입력받을 배열 선언
        double sum = 0;
        
        // 8개의 점수를 입력받고 합을 구합니다.
        for (int i = 0; i < 8; i++) {
            sum += scanner.nextDouble();
        }
        
        // 평균 계산
        double average = sum / 8;
        
        // 평균을 소수 첫째 자리까지 출력
        System.out.printf("%.1f\n", average);
    }
}