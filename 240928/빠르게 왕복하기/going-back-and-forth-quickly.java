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

        // A->B로 가는 시간 정렬
        Collections.sort(people, Comparator.comparingInt(p -> p.timeToB));

        // 최소 시간 계산
        int totalTime = 0;
        int timeAtB = 0;

        for (Person person : people) {
            // A->B로 이동
            timeAtB += person.timeToB;
            // B->A로 이동
            totalTime = Math.max(totalTime, timeAtB + person.timeToA);
        }

        System.out.println(totalTime);
        scanner.close();
    }
}