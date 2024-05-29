public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 3;
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
temp = a;
 a = b;
 b = temp;

public class Main {
    public static void main (String args[]) {
        int a = 5, b = 3;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("A is " + a + " B is " + b);
    }
}

*/