import java.util.Scanner; //임포트해줘야함!
public class Main {
    public static void main(String[] args) {
        // Scanner 사용 (2)
        Scanner sc = new Scanner(System.in);
        // 정수 입력받기
        int n = sc.nextInt();
        // 출력
        System.out.println("Your score is " + n + " point.");
    }
}