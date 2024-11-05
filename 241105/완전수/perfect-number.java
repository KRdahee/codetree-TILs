import java.util.Scanner;

public class Main {
    // 완전수 판별 함수
    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        
        // n의 진약수를 구해서 그 합을 구함
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        // 진약수들의 합이 n과 같으면 완전수
        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // start와 end 값 입력받기
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // 완전수의 개수 세기
        int count = 0;
        
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                count++; // 완전수라면 카운트
            }
        }
        
        // 완전수의 개수 출력
        System.out.println(count);
        
        sc.close();
    }
}