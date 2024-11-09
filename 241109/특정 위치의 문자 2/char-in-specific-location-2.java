import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 10개의 문자를 입력받을 배열
        String[] characters = new String[10];
        
        // 10개의 문자 입력 받기
        for (int i = 0; i < 10; i++) {
            characters[i] = sc.next();
        }
        
        // 두 번째, 다섯 번째, 여덟 번째 문자를 출력
        System.out.println(characters[1] + " " + characters[4] + " " + characters[7]);
        
        sc.close();
    }
}