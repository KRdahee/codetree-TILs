import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 첫 번째 조건: a가 b보다 작으면 1, 아니면 0을 출력
        if (a < b) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        // 공백 출력
        System.out.print(" ");

        // 두 번째 조건: a가 b와 같으면 1, 아니면 0을 출력
        if (a == b) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        // Scanner 닫기
        sc.close();
    }
}