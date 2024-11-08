import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10개의 정수 입력받기
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 1. 짝수 번째 원소의 합 (인덱스 1, 3, 5, 7, 9)
        int evenSum = 0;
        for (int i = 1; i < 10; i += 2) {
            evenSum += numbers[i];
        }
        
        // 2. 3의 배수 번째 원소의 평균 (인덱스 2, 5, 8)
        int sumOfMultiplesOfThree = 0;
        int countOfMultiplesOfThree = 0;
        for (int i = 2; i < 10; i += 3) {
            sumOfMultiplesOfThree += numbers[i];
            countOfMultiplesOfThree++;
        }
        
        // 평균을 반올림하여 소수 첫째 자리까지 출력
        double averageOfMultiplesOfThree = (double) sumOfMultiplesOfThree / countOfMultiplesOfThree;
        
        // 결과 출력
        System.out.printf("%d %.1f\n", evenSum, Math.round(averageOfMultiplesOfThree * 10.0) / 10.0);
    }
}