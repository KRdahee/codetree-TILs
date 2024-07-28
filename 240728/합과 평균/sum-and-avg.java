import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a + b;
        double sum = max / (double) 2;

        System.out.printf("%d %.1f", max, sum);

    }
}