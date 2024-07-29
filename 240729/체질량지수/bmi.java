import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt(); // 신장 (cm)
        double w = sc.nextInt(); // 체중 (kg)

        // 신장을 미터 단위로 변환
        double hInMeters = h / 100.0;

        // BMI 계산
        double bmi = w / (hInMeters * hInMeters);
        
        // 소수점 없이 BMI 출력
        int bmiIntegerPart = (int) bmi;
        System.out.println(bmiIntegerPart);

        // BMI 기준에 따라 출력
        if (bmi >= 25) {
            System.out.println("Obesity");
        }

        sc.close(); // Scanner 자원 반환
    }
}