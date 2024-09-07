import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // 배수가 범위 내에 존재하는지 확인
        boolean hasMultiple = false;
        
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                hasMultiple = true;
                break;
            }
        }
        
        // 결과 출력
        if (hasMultiple) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        
        scanner.close();
    }
}