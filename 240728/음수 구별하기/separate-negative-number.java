import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 20) {
            a += 0;
            System.out.println(a);
            a -= 1;
        }

        System.out.println(a + "\nminus");
    }
}