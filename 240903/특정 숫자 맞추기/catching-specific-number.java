import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt(); // 입력 받기

            if (number < 25) {
                System.out.println("Higher");
            } else if (number > 25) {
                System.out.println("Lower");
            } else { // number == 25
                System.out.println("Good");
                break; // 프로그램 종료
            }
        }

        scanner.close();
    }
}