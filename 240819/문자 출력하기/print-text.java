import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문자를 입력받습니다.
        String input = scanner.nextLine();
        
        // 문자를 8회 출력합니다.
        int count = 0;
        while (count < 8) {
            System.out.print(input);
            count++;
        }
        
        // Scanner 객체를 닫습니다.
        scanner.close();
    }
}