public class Main {
    public static void main(String[] args) {
        // 5부터 17까지의 정수를 공백으로 구분하여 출력
        for (int i = 5; i <= 17; i++) {
            // 마지막 숫자인 경우에는 공백을 추가하지 않음
            if (i > 5) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        // 줄 바꿈
        System.out.println();
    }
}