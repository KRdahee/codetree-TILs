import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄에서 원소의 개수 n을 입력받음
        int n = sc.nextInt();
        
        // 두 번째 줄에서 n개의 원소를 입력받음
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 짝수만 새로운 배열에 저장
        int[] evenNumbers = new int[n];  // 짝수만 저장할 배열
        int evenCount = 0;  // 짝수의 개수를 세는 변수
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {  // 짝수인지 확인
                evenNumbers[evenCount] = arr[i];  // 짝수라면 저장
                evenCount++;  // 짝수 개수 증가
            }
        }
        
        // 저장된 짝수들 출력
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        sc.close();
    }
}