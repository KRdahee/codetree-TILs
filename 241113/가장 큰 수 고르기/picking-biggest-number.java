import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 정수를 입력받음
        int max = Integer.MIN_VALUE;  // 가장 작은 초기값 설정
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;  // 가장 큰 수를 갱신
            }
        }
        
        // 결과 출력
        System.out.println(max);
        
        sc.close();
    }
}
