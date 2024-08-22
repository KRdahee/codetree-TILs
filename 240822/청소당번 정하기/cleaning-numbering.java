import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력받기
        int n = scanner.nextInt();
        
        // 청소 주기
        int classroomPeriod = 2;
        int corridorPeriod = 3;
        int restroomPeriod = 12;
        
        // 청소 횟수 초기화
        int classroomCount = 0;
        int corridorCount = 0;
        int restroomCount = 0;
        
        // 1일부터 n일 사이의 각 날에 대해 체크
        for (int day = 1; day <= n; day++) {
            // 화장실 청소를 우선적으로 체크
            if (day % restroomPeriod == 0) {
                restroomCount++;
            }
            // 복도 청소를 체크
            else if (day % corridorPeriod == 0) {
                corridorCount++;
            }
            // 교실 청소를 체크
            else if (day % classroomPeriod == 0) {
                classroomCount++;
            }
        }
        
        // 결과 출력
        System.out.println(classroomCount + " " + corridorCount + " " + restroomCount);
        
        // Scanner 자원 해제
        scanner.close();
    }
}