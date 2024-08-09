import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 월 입력 받기
        int month = scanner.nextInt();

        // 일 수를 저장하기 위한 배열
        int[] daysInMonth = {
            31, // 1월
            28, // 2월 (윤년이 아닌 해)
            31, // 3월
            30, // 4월
            31, // 5월
            30, // 6월
            31, // 7월
            31, // 8월
            30, // 9월
            31, // 10월
            30, // 11월
            31  // 12월
        };

        // 배열에서 해당 월의 일 수를 출력
        if (month >= 1 && month <= 12) {
            System.out.println(daysInMonth[month - 1]);
        } else {
            System.out.println("Invalid month"); // 잘못된 입력 처리 (1~12 범위가 아닌 경우)
        }

        // 자원 해제
        scanner.close();
    }
}