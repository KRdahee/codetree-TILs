import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a > 0) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}