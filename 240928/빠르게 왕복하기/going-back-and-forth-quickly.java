import java.util.*;

public class Main {
    static class Person {
        int timeToB;
        int timeToA;

        Person(int timeToB, int timeToA) {
            this.timeToB = timeToB;
            this.timeToA = timeToA;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int timeToB = scanner.nextInt();
            int timeToA = scanner.nextInt();
            people.add(new Person(timeToB, timeToA));
        }

        // A->B로 가는 시간 기준으로 정렬
        Collections.sort(people, Comparator.comparingInt(p -> p.timeToB));

        // 총 시간을 계산
        int totalTime = 0; // 총 시간
        int currentBTime = 0; // 현재 B 지점에 도착한 시간

        for (Person person : people) {
            // A에서 B로 이동
            currentBTime += person.timeToB;

            // B에서 A로 이동
            totalTime = Math.max(totalTime, currentBTime + person.timeToA);
        }

        System.out.println(totalTime);
        scanner.close();
    }
}