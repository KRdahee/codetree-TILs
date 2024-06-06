import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt(); 
    int b = sc.nextInt();

    System.out.println(a + 8);
    System.out.println(b * 3);
    System.out.println((a+8)*(b*3));

    }

}

/*
public class Main {
    public static void main(String[] args) {
        int a = 9, b = 4;

        a = a + 5;
        System.out.println(a);

        a -= 5;
        System.out.println(a);

        a %= b;
        System.out.println(a);

        b *= 3;
        System.out.println(b);
    }
}
or

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        w += 8;
        h *= 3;

        System.out.println(w);
        System.out.println(h);
        System.out.println(w * h);
    }
}



*/