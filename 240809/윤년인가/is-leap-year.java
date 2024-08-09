import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 연도 입력 받기
        int year = scanner.nextInt();

        // 윤년 판단
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        // 결과 출력
        System.out.println(isLeapYear);

        // 자원 해제
        scanner.close();
    }
}