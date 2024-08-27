import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        long product = 1;
        int i = 1;

        // 1부터 차례로 숫자를 곱해가며 현재 곱을 계산
        while (product < n) {
            product *= i;
            if (product >= n) {
                break;
            }
            i++;
        }

        // 마지막으로 곱해진 숫자를 출력
        System.out.println(i);
    }
}