import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
         
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.print((10000000 * num1) + num2);
    }
}