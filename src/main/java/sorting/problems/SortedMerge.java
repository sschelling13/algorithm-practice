package sorting.problems;

import java.util.Arrays;

public class SortedMerge {

    public static void sortedMerge(int[] a, int[] b, int lastA, int lastB) throws IllegalArgumentException {
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int indexMerged = lastA + lastB - 1;

        while (indexB >= 0) {
            if  (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA];
                indexA--;
            } else {
                a[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 3, 5, -1, -1, -1};
        int[] b = new int[] {2, 4};

        sortedMerge(a, b, 3, 2);

        System.out.println(Arrays.toString(a));
    }
}
