import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Scanner 객체를 닫습니다.
        scanner.close();
        
        // BigDecimal 객체를 생성하여 a와 b를 나타냅니다.
        BigDecimal numerator = new BigDecimal(a);
        BigDecimal denominator = new BigDecimal(b);
        
        // a/b의 값을 계산합니다.
        BigDecimal result = numerator.divide(denominator, 21, RoundingMode.DOWN);
        
        // DecimalFormat을 사용하여 소수점 21자리까지 포맷팅
        DecimalFormat df = new DecimalFormat("0.#######################"); // 최대 21자리까지 포맷
        df.setMinimumFractionDigits(21); // 소수점 21자리 유지
        df.setMaximumFractionDigits(21); // 소수점 21자리 유지

        // 결과를 문자열로 변환하여 출력합니다.
        String formattedResult = df.format(result);
        System.out.println(formattedResult);
    }
}