import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // start와 end 값 입력받기
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        int count = 0;
        
        // start에서 end까지의 범위 내에서 완전 제곱수를 찾아 카운트
        for (int i = 1; i * i <= end; i++) {
            int square = i * i;
            if (square >= start && square <= end) {
                count++;  // 약수가 정확히 3개인 수 (완전 제곱수) 발견
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        sc.close();
    }
}