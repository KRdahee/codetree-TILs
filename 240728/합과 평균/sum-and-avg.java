import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a + b; //합
        double sum = max / (double) 2; //평균

        System.out.printf("%d %.1f", max, sum); //공백을 주고 합과 평균 출력하기

    }
}