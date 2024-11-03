public class Main {
    public static void main(String[] args) {
        // 1부터 19까지의 구구단을 출력
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                // 각 곱셈 결과를 출력
                System.out.print(i + " * " + j + " = " + (i * j));
                
                // j가 19가 아닌 경우 '/'를 추가하여 구분
                if (j % 2 == 0 && j < 19) {
                    System.out.println(" / ");
                }
            }
            System.out.println(); // 각 i에 대해 줄바꿈
        }
    }
}