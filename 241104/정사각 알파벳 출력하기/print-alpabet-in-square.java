import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char currentChar = 'A'; // 시작하는 알파벳
        
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(currentChar);
                currentChar++; // 다음 알파벳으로 이동
            }
            System.out.println(row.toString());
        }
        
        scanner.close();
    }
}

/*
아스키 코드 (ASCII)
Java 에서 사용할 수 있는 모든 문자들은 전부 하나의 숫자와 대응되며, 이를 아스키 코드라 부릅니다.

그 중에서도 알파벳 대문자 (A, B, C, ...), 소문자 (a, b, c, ....) 끼리는 연속한 숫자들로 매칭이 되어있습니다.

만약 문자 'A'의 아스키 코드 값이 15였다면, 문자 'B'의 아스키 코드 값은 16이 된다는 것입니다.

Java에서 특정 문자의 아스키 코드 값은 해당 문자의 정수형 출력을 이용해 알 수 있습니다. 실제 문자 'A'의 아스키 코드 값은 65이기 때문에 정수형 변환을 통해, 즉 'A'의 type 을 int 로 바꾸어 출력하면 65가 출력됩니다.


>> 
System.out.print((int)'A');

65
반대로 아스키 코드 값을 알고 있을 때, 대응되는 문자를 알아 낼수는 없을까요? 이 경우에는 아스키 코드값을 문자형 변환을 통해 출력하면 됩니다.

>> 
System.out.print((char)65);

'A'
그렇다면 특정 대문자 알파벳 x 다음에 오는 문자는 어떻게 구해볼 수 있을까요?

알파벳은 전부 연속한 아스키 코드로 이루어져 있다고 했으니 66번째 아스키코드와 대응되는 문자는 'B'라는 것을 알 수 있습니다.

java에서는 x 에 'A' 가 들어가 있다면, x++ (x+=1) 을 해주는것으로 x의 값을 'B'로 만들 수 있습니다.

public class Main {
    public static void main(String[] args) {
        int x = 'A';                 // 65
        x++;                         // 66
        System.out.print((char)x);   // B
    }
}
따라서 알파벳 x 다음 알파벳을 구하는 것은 x+1로 표현이 가능합니다.

Java 코드
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);

        System.out.println((int)x);
        System.out.println((int)(x + 1));
        System.out.println((char)(x + 1));
    }
}
출력결과
>> A

65
66
B
*/