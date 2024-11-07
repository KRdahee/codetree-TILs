import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 최대 10개의 정수를 저장할 수 있는 배열
        int[] numbers = new int[10];
        int count = 0;

        // 정수를 입력받고 0이 들어오면 종료
        while (count < 10) {
            int num = scanner.nextInt();
            
            // 0이 입력되면 종료
            if (num == 0) {
                break;
            }

            // 배열에 저장
            numbers[count++] = num;
        }

        // 역순으로 출력
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}