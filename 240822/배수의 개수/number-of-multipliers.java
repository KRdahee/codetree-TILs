import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countMultiplesOf3 = 0;
        int countMultiplesOf5 = 0;
        
        // 10개의 숫자를 입력받고 3의 배수와 5의 배수 개수를 세기
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number % 3 == 0) {
                countMultiplesOf3++;
            }
            if (number % 5 == 0) {
                countMultiplesOf5++;
            }
        }
        
        // 3의 배수와 5의 배수 개수를 공백으로 구분하여 출력
        System.out.println(countMultiplesOf3 + " " + countMultiplesOf5);
        
        // Scanner 자원 해제
        scanner.close();
    }
}