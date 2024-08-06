import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A 학생의 점수 입력
        int mathA = sc.nextInt();
        int englishA = sc.nextInt();

        // B 학생의 점수 입력
        int mathB = sc.nextInt();
        int englishB = sc.nextInt();

        // 우선순위 결정 및 출력
        if (mathA > mathB) {
            System.out.println("A");
        } else if (mathA < mathB) {
            System.out.println("B");
        } else { // 수학 점수가 같은 경우
            if (englishA > englishB) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}