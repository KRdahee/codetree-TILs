import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stuff = sc.nextInt();

        if (stuff == 0) {
            System.out.println("no");
        } else if (stuff >= 3000) {
            System.out.println("book");
        } else if (stuff <= 1500) {
            System.out.println("mask");
        }

        sc.close();
    }
}