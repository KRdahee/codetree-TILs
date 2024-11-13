import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 배열 초기화
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        
        // 사용자로부터 문자 입력 받기
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        
        // 문자 위치 찾기
        boolean found = false; // 문자가 발견되었는지 확인하는 플래그
        
        // 배열을 순회하며 입력한 문자와 비교
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println(i); // 문자의 위치 출력
                found = true;
                break;
            }
        }
        
        // 문자가 배열에 없다면 "None" 출력
        if (!found) {
            System.out.println("None");
        }
        
        sc.close();
    }
}
