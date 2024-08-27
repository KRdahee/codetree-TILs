import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        int i = 0;

        // 1부터 차례로 숫자를 더해가며 합을 계산
        while (sum < n) {
            i++;
            sum += i;
        }

        // 합이 n 이상이 되는 순간의 숫자 i를 출력
        System.out.println(i);
    }
}