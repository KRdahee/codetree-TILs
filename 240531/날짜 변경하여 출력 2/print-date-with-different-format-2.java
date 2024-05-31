import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner day = new Scanner(System.in);

    day.useDelimiter("-"); // : 기준으로 잘라서 입력 받겠다는 뜻

    int m = day.nextInt();
    int d = day.nextInt();
    int y = day.nextInt();

    System.out.println(y + "." + m + "." + d);

    }

    }