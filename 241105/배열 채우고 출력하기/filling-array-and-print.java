import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10개의 문자를 배열에 저장
        String[] arr = new String[10];
        
        // 10개의 문자 입력받기
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next(); // 하나씩 입력받아 배열에 저장
        }
        
        // 배열을 거꾸로 출력
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i]); // 거꾸로 출력
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}