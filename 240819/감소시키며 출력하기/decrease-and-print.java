public class Main {
    public static void main(String[] args) {
        // 시작 값과 끝 값을 설정합니다.
        int start = 17;
        int end = 5;

        // 시작 값부터 끝 값까지 1씩 감소하며 출력합니다.
        for (int i = start; i >= end; i--) {
            if (i < start) {
                System.out.print(" ");
            }
            System.out.print(i);
        }

        // 결과가 출력된 후 추가적인 줄바꿈을 추가합니다.
        System.out.println();
    }
}