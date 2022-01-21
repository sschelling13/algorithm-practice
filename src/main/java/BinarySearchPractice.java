import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchPractice {


    // Functions
    public static int shipWithinDays(List<Integer> weights, int D) {
        Integer left = Collections.max(weights);
        Integer right = weights.stream().mapToInt(Integer::intValue).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (feasible(mid, weights, D)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean feasible(int capacity, List<Integer> weights, int D) {
        int days = 1;
        int total = 0;

        for (int weight : weights) {
            total += weight;

            if (total > capacity) {
                total = weight;
                days++;
                if (days > D)
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(3); list.add(5); list.add(10);

        int out = shipWithinDays(list, 1);

        System.out.println("Ship capacity is " + out);
    }
}

