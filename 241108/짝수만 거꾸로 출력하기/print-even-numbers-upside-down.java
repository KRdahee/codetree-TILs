import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력
        int n = scanner.nextInt();
        
        // n개의 정수 입력받기
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 짝수만 담을 리스트
        List<Integer> evens = new ArrayList<>();
        
        // 입력된 수 중 짝수만 리스트에 추가
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evens.add(numbers[i]);
            }
        }
        
        // 짝수를 역순으로 출력
        for (int i = evens.size() - 1; i >= 0; i--) {
            System.out.print(evens.get(i) + " ");
        }
    }
}