import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 과목 수 입력 받기
        int n = scanner.nextInt();
        
        // 학점 입력 받기
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }
        
        // 평균 계산
        double average = sum / n;
        
        // 평균을 반올림하여 소수 첫째 자리까지 출력
        System.out.printf("%.1f\n", Math.round(average * 10) / 10.0);
        
        // 평균에 따른 등급 출력
        if (average >= 4.0) {
            System.out.println("Perfect");
        } else if (average >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}