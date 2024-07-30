import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 상품과 가격 정보
        String[] items = {"book", "mask"};
        int[] prices = {3000, 1000};

        int maxPrice = 0;
        String maxItem = "";

        // n 이하의 가장 비싼 물건 찾기
        for (int i = 0; i < items.length; i++) {
            if (prices[i] <= n && prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxItem = items[i];
            }
        }

        if (!maxItem.isEmpty()) {
            System.out.println(maxItem);
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}