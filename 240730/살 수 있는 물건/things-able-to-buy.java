import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stuff = sc.nextInt();

        if (stuff >= 3000) {
            System.out.println("book");
        } else if (stuff <= 1500 && stuff > 0) {
            System.out.println("mask");
        } else if (stuff == 0) {
            System.out.println("no");
        } else {
            // Handle any other cases here if needed
            System.out.println("Unknown case");
        }

        sc.close();
    }
}