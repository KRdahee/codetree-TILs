import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키와 몸무게를 입력받기
        double height = sc.nextDouble(); // 신장 (미터 단위)
        double weight = sc.nextDouble(); // 몸무게 (킬로그램 단위)

        // BMI 계산
        double bmi = weight / (height * height);

        // 비만 판별
        if (bmi <= 25) {
            System.out.println((int)bmi);
            System.out.println("Obesity");
        } else {
            System.out.println("not obese.");
        }

        sc.close(); // Scanner 자원 반환
    }
}