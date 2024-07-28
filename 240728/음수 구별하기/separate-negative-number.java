import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 20) {
            // Do nothing for positive values greater than 14
            System.out.println(a);
            a -= 1; // Decrease a by 1 if a > 14
        } else {
            // Print the value of a
            System.out.println(a);
        }
        
        // Print "minus" only if a is negative
        if (a < 0) {
            System.out.println("minus");
        }

        sc.close(); // Close the scanner to release resources
    }
}