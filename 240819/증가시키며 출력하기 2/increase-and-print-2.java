public class Main {
    public static void main(String[] args) {
        // 시작 값과 끝 값을 설정합니다.
        int start = 10;
        int end = 26;
        
        // 현재 값을 start로 초기화합니다.
        int current = start;
        
        // 현재 값이 end보다 작거나 같을 때까지 반복합니다.
        while (current <= end) {
            // 마지막 숫자 이외에는 공백을 추가합니다.
            if (current > start) {
                System.out.print(" ");
            }
            // 현재 값을 출력합니다.
            System.out.print(current);
            // 현재 값을 1씩 증가시킵니다.
            current++;
        }
        
        // 결과가 출력된 후 추가적인 줄바꿈을 추가합니다.
        System.out.println();
    }
}