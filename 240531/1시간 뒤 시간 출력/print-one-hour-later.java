import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    sc.useDelimiter(":"); // : 기준으로 잘라서 입력 받겠다는 뜻
   
    int h = sc.nextInt() + 1; // : 기호가 나오기 전까지 입력 진행
    int m = sc.nextInt(); // : 기호가 나오기 전 or 입력의 마지막 부분까지 진행
    
    System.out.println(h + ":" + m);
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split(":");
        System.out.println(strArr[0] + "\n" + strArr[1]);
    }
}

*/