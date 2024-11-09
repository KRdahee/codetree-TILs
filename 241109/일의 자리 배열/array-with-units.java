import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째와 두 번째 항을 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 첫 번째, 두 번째 항을 출력
        System.out.print(a + " " + b + " ");
        
        // 이전 두 항을 이용해 세 번째부터 10번째 항까지 구함
        int prev2 = a;  // 전전항
        int prev1 = b;  // 전항
        
        for (int i = 0; i < 8; i++) {
            int next = (prev2 + prev1) % 10;  // 전전항과 전항의 합의 1의 자리
            System.out.print(next + " ");
            prev2 = prev1;  // 전전항을 갱신
            prev1 = next;   // 전항을 갱신
        }
        
        sc.close();
    }
}