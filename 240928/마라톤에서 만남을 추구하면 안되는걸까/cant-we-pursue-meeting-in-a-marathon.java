import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 사람 수
        long L = scanner.nextLong(); // 몇 바퀴 도는지
        long C = scanner.nextLong(); // 트랙의 길이

        long[] speeds = new long[N];
        for (int i = 0; i < N; i++) {
            speeds[i] = scanner.nextLong(); // 각 사람의 속도
        }

        // 각 사람의 총 거리 계산
        long totalMeetings = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 속도가 더 빠른 사람이 느린 사람을 지나치는 횟수
                if (speeds[i] < speeds[j]) {
                    // j가 i를 지나치게 되는 시점
                    long timeToMeet = (L * C) / (speeds[j] - speeds[i]);
                    totalMeetings += timeToMeet;
                } else {
                    // i가 j를 지나치게 되는 시점
                    long timeToMeet = (L * C) / (speeds[i] - speeds[j]);
                    totalMeetings += timeToMeet;
                }
            }
        }

        System.out.println(totalMeetings);
        scanner.close();
    }
}