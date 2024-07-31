import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
        String input = sc.nextLine().trim(); // 입력된 문자열에서 양쪽 공백 제거

        // 대문자로 변환
        input = input.toUpperCase();

        // 문자열 비교
        if (input.equals("S")) {
            System.out.println("Superior");
        } else if (input.equals("A")) {
            System.out.println("Excellent");
        } else if (input.equals("B")) {
            System.out.println("Good");
        } else if (input.equals("C")) {
            System.out.println("Usually");
        } else if (input.equals("D")) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}