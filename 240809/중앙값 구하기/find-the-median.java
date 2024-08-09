import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 배열에 입력된 값 저장
        int[] numbers = {a, b, c};

        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 중앙값은 정렬된 배열의 두 번째 값
        int median = numbers[1];

        // 중앙값 출력
        System.out.println(median);

        // 자원 해제
        scanner.close();
    }
}