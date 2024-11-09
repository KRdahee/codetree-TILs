import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄에서 원소의 개수 n을 입력받기
        int n = sc.nextInt();
        
        // 두 번째 줄에서 n개의 원소를 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 각 원소의 제곱을 출력하기
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
        
        sc.close();
    }
}