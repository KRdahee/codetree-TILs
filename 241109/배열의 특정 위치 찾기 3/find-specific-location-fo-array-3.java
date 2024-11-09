import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력받을 최대 정수 개수를 설정
        int[] numbers = new int[100];
        int index = 0;
        
        // 정수 입력 받기
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numbers[index++] = num;
        }
        
        // 0이 등장할 때마다 그 앞의 3개 숫자의 합을 출력
        for (int i = 3; i < index; i++) {
            if (numbers[i] == 0) {
                int sum = numbers[i-1] + numbers[i-2] + numbers[i-3];
                System.out.println(sum);
            }
        }

        sc.close();
    }
}