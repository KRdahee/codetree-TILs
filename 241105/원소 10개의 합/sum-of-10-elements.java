import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 10개의 숫자를 입력받기 (공백을 기준으로 분리된 숫자들)
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt(); // 각 숫자를 합산
        }
        
        // 합 출력
        System.out.println(sum);
        
        // Scanner 객체 닫기
        sc.close();
    }
}