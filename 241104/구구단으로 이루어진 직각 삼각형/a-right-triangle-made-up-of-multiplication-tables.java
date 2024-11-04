import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();
            for (int j = 1; j <= n - i + 1; j++) {
                result.append(i).append(" * ").append(j).append(" = ").append(i * j);
                if (j < n - i + 1) {
                    result.append(" / ");
                }
            }
            System.out.println(result.toString());
        }
        
        scanner.close();
    }
}