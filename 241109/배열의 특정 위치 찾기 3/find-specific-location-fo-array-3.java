import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 최대 100개의 정수를 저장할 배열
        int[] numbers = new int[100];
        int index = 0;
        
        // 정수 입력받기
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            numbers[index++] = num;
            
            // 0을 만나면 그 이전 3개의 수의 합을 출력
            if (num == 0) {
                // 0이 등장할 때 그 이전 3개의 수 합을 계산
                int sum = numbers[index-2] + numbers[index-3] + numbers[index-4];
                System.out.println(sum);
                break;
            }
        }
        
        sc.close();
    }
}