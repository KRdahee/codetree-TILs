import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        if (money >= 3000) {
            System.out.println("book");
        } else if (money >= 1000 && money <= 2999) {
            System.out.println("mask");
        } else if (money >= 500 && money <= 999) {
            System.out.println("pen");
        } else if (money >= 0 && money <= 499) {
            System.out.println("no");
        } else {
            System.out.println("Invalid input");
        }
    }
}