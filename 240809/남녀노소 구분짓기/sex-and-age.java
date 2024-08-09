import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 성별 입력 받기
        int gender = scanner.nextInt();
        
        // 나이 입력 받기
        int age = scanner.nextInt();

        // 나이에 따라 성인과 미성년자를 구분
        if (age >= 19) {
            if (gender == 0) {
                System.out.println("MAN");
            } else {
                System.out.println("WOMAN");
            }
        } else {
            if (gender == 0) {
                System.out.println("BOY");
            } else {
                System.out.println("GIRL");
            }
        }

        scanner.close();
    }
}