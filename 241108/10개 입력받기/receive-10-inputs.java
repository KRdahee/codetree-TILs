import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;    // 합을 저장할 변수
        int count = 0;  // 입력된 숫자의 개수
        
        // 최대 10번까지 입력받음
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            
            // 0이 입력되면 그때까지의 합과 평균 출력 후 종료
            if (num == 0) {
                break;
            }

            sum += num;  // 합에 더함
            count++;     // 입력된 숫자의 개수 증가
        }

        // 합과 평균을 출력
        double average = count > 0 ? (double) sum / count : 0.0;
        System.out.printf("%d %.1f\n", sum, average);
    }
}