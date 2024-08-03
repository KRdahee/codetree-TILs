import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String strA = sc.next();
        String strB = sc.next();
        
        // 문자열을 정수로 변환합니다.
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        // 비교 연산 결과를 정수로 변환하여 출력합니다.
        System.out.println(a >= b ? 1 : 0);
        System.out.println(a > b ? 1 : 0);
        System.out.println(a <= b ? 1 : 0);
        System.out.println(a < b ? 1 : 0);
        System.out.println(a == b ? 1 : 0);
        System.out.println(a != b ? 1 : 0);

        // Scanner 닫기
        sc.close();
    }
}