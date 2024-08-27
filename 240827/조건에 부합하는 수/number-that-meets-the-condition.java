import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        
        List<Integer> results = new ArrayList<>();
        
        for (int i = 1; i <= a; i++) {
            boolean condition1 = (i % 2 == 0) && (i % 4 != 0);  // 짝수이면서 4의 배수가 아닌 수
            boolean condition2 = (i / 8) % 2 == 0;  // 8로 나눈 몫이 짝수인 수
            boolean condition3 = (i % 7) < 4;  // 7로 나눈 나머지가 4보다 작은 수
            
            if (!(condition1 && condition2 && condition3)) {
                results.add(i);
            }
        }
        
        for (int num : results) {
            System.out.print(num + " ");
        }
    }
}