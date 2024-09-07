import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 변수 초기화
        boolean allMultiplesOfThree = true;
        
        // 5개의 정수 입력 받기
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num % 3 != 0) {
                allMultiplesOfThree = false;
            }
        }
        
        // 결과 출력
        System.out.println(allMultiplesOfThree ? 1 : 0);
        
        scanner.close();
    }
}