import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int x = sc.nextInt();
        
        // 배수를 저장할 배열 선언 (최대 10개)
        int[] multiples = new int[100];
        int count = 0; // 배수의 개수를 셈
        int fiveCount = 0; // 5의 배수 개수를 셈
        
        // 배수를 차례대로 저장하고 출력
        while (true) {
            int multiple = x * (count + 1); // x의 배수 계산
            multiples[count] = multiple; // 배열에 배수 저장
            
            // 출력
            System.out.print(multiples[count] + " ");
            
            // 5의 배수인지 확인
            if (multiples[count] % 5 == 0) {
                fiveCount++;
            }
            
            // 5의 배수가 두 번 출력되면 종료
            if (fiveCount == 2) {
                break;
            }
            
            count++; // 다음 배수로 이동
        }
        
        sc.close();
    }
}