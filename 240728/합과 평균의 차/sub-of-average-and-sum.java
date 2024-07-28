import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculate the sum
        int sum = a + b + c; // Sum of the three numbers
        
        // Calculate the average and cast to double for precision
        double average = sum / 3.0; // Average of the three numbers

        // Print the sum
        System.out.println(sum);
        
        // Print the average as an integer (without decimal places)
        System.out.println((int)average); // Casting to int to remove decimal places

        System.out.println(sum - (int)average;)
        
        sc.close(); // Close the scanner to release resources
    }
}