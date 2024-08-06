import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 사람의 정보 입력
        int age1 = sc.nextInt();
        char gender1 = sc.next().charAt(0);

        // 두 번째 사람의 정보 입력
        int age2 = sc.nextInt();
        char gender2 = sc.next().charAt(0);

        // 조건을 검사하여 출력
        if ((age1 >= 19 && gender1 == 'M') || (age2 >= 19 && gender2 == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}