import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A로 분류되는 사람 수를 세기 위한 변수
        int countA = 0;

        for (int i = 0; i < 3; i++) {
            // 입력 받기
            String[] input = scanner.nextLine().split(" ");
            String symptoms = input[0];
            int temperature = Integer.parseInt(input[1]);

            // 진료소 분류 및 A로 가는 사람 수 계산
            if (symptoms.equals("Y") && temperature >= 37) {
                countA++;
            }
        }

        // 위급상황 판별
        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }

        // 자원 해제
        scanner.close();
    }
}