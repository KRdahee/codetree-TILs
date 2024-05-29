public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 2;
        int b = 5;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
/*
public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 2, b = 5;

        // 교체
        int temp = a;
        a = b;
        b = temp;

        // 출력
        System.out.println(a);
        System.out.println(b);
    }
}
*/