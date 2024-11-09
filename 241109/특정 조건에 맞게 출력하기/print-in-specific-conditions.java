import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        
        // 결과를 저장할 배열
        StringBuilder result = new StringBuilder();
        
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            
            if (num == 0) {
                break;  // 0을 만나면 종료
            }
            
            if (num % 2 == 0) {
                // 짝수일 경우 2로 나눈 몫
                result.append(num / 2).append(" ");
            } else {
                // 홀수일 경우 3을 더한 값
                result.append(num + 3).append(" ");
            }
        }
        
        // 마지막 공백을 제거하고 출력
        System.out.println(result.toString().trim());
        
        sc.close();
    }
}