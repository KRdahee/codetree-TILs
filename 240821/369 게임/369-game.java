import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || Integer.toString(i).contains("3") || Integer.toString(i).contains("6") || Integer.toString(i).contains("9")) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}