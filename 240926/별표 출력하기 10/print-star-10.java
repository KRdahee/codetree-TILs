import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // 사용자로부터 n 입력받기

        // 별의 개수 배열
        int[] starCounts = {1, 5, 2, 4, 3};

        // 상단 부분 출력
        for (int count : starCounts) {
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈
        }

        // 하단 부분 출력 (대칭)
        int[] lowerStarCounts = {3, 4, 2, 5, 1};

        for (int count : lowerStarCounts) {
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈
        }

        scanner.close();
    }
}