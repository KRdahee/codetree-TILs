import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + b);      //두 정수를 더했을 때의 결과
    System.out.println(a - b);      //a에서 b를 뺐을 때의 결과
    System.out.println(a/b);        //나누기 연산시 몫/ 연산
    System.out.println(a%b);        //나머지의 경우 % 연산
    
    }
}

/*
public class Main {
    public static void main(String[] args) {
        int a = 9, b = 4;

        System.out.println((double)a / b);
        System.out.println((double)(a / b));
    }
}
Java에서 자주 이용되는 사칙연산은 덧셈, 뺄셈, 나눗셈, 곱셈 입니다.

덧셈, 뺄셈, 곱셈의 경우에는 +, -, *를 사용하면 되며, 나눗셈의 경우에는 몫과 나머지를 잘 구해야 합니다.

나누기 연산시 몫의 경우에는 / 연산을 통해 구할 수 있으며, 나머지의 경우 % 연산을 통해 구할 수 있습니다.

만약 5를 2로 나누는 경우 처럼 나누어 떨어지지 않는 경우에 나눗셈을 진행하여 그 결과를 실수 값으로 받고 싶은 경우라면, 
연산이 이루어지는 항들 중 반드시 실수 type이 들어있어야 합니다.

public class Main {
    public static void main(String[] args) {
        int a = 9, b = 4;

        System.out.print((a + b) + " " + (a * b) + " " + (a - b) + " ");
        System.out.print((a / b) + " " + (a % b) + " " + ((double)a / b) + " ");
    }
}

*/