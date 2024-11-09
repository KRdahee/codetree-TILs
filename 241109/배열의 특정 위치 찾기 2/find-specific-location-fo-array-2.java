import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10개의 정수를 저장할 배열
        int[] numbers = new int[10];
        
        // 10개의 정수 입력 받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 홀수 번째의 합 (0, 2, 4, 6, 8번째 인덱스)
        int oddSum = 0;
        // 짝수 번째의 합 (1, 3, 5, 7, 9번째 인덱스)
        int evenSum = 0;
        
        // 합 계산
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {  // 홀수 번째 (인덱스 0, 2, 4, 6, 8)
                oddSum += numbers[i];
            } else {  // 짝수 번째 (인덱스 1, 3, 5, 7, 9)
                evenSum += numbers[i];
            }
        }
        
        // 두 합의 차 (큰 값에서 작은 값을 뺀 값 출력)
        int result = Math.abs(oddSum - evenSum);
        System.out.println(result);
        
        sc.close();
    }
}