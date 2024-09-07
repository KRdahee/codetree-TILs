import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        boolean found = false;
        
        // a 이상 b 이하 범위에서 c의 배수가 있는지 확인
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                found = true;
                break;
            }
        }
        
        // 결과 출력
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean satisfied = false;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                satisfied = true;
            }
        }
        if (satisfied == true) {
            System.out.println("Exists");
        }
        else {
            System.out.println("Not exists");
        }
    }
}
*/