import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // A의 점수를 입력받기
        int mathA = scanner.nextInt();
        int englishA = scanner.nextInt();
        
        // B의 점수를 입력받기
        int mathB = scanner.nextInt();
        int englishB = scanner.nextInt();
        
        // A가 B보다 두 과목 모두 점수가 높은지 확인
        if (mathA > mathB && englishA > englishB) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}