import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + b);      //두 정수를 더했을 때의 결과
    System.out.println(a - b);      //a에서 b를 뺐을 때의 결과
    System.out.println((double)b/a);//나누기 연산시 몫/ 연산
    System.out.println(a%b);        //나머지의 경우 % 연산
    
    }
}