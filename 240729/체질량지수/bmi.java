import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double w = sc.nextInt();
        double bmi = w / ((h * h) / 10000);
        
        // 소수점 없이 BMI 출력
        int bmiRounded = (int) Math.round(bmi);
        System.out.println(bmiRounded);

        // BMI 기준에 따라 출력
        if (bmi >= 25) {
            System.out.println("Obesity");
        }

        sc.close(); // Scanner 자원 반환
    }
}