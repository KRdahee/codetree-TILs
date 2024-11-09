import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10개의 원소를 배열로 입력 받기
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 3의 배수가 처음 등장하는 위치의 바로 앞 원소 찾기
        for (int i = 1; i < 10; i++) {  // 첫 번째 원소는 3의 배수가 아님이 보장됨
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i - 1]);
                break;  // 첫 번째 3의 배수가 나왔으므로 출력 후 종료
            }
        }
        
        sc.close();
    }
}