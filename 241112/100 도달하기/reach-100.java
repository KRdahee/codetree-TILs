import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int n = scanner.nextInt();
        
        // 첫 번째와 두 번째 항 초기화
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);  // 첫 번째 항은 1
        sequence.add(n);  // 두 번째 항은 n
        
        // 세 번째 항부터 시작해서, 각 항은 전전항과 전항의 합으로 계산
        while (true) {
            int nextTerm = sequence.get(sequence.size() - 2) + sequence.get(sequence.size() - 1);
            sequence.add(nextTerm);
            if (nextTerm > 100) {
                break; // 100을 넘으면 그 값을 출력하고 종료
            }
        }
        
        // 결과 출력
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}
