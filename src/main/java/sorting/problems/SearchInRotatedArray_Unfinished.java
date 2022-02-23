package sorting.problems;

public class SearchInRotatedArray_Unfinished {


    public static int search(int[] a, int left, int right, int x) {
        int mid = left + right / 2;
        if (x == a[mid]) {
            return mid;
        }
        if (right < left) {
            return -1;
        }

        if (a[left] < a[mid]) {
            if (x >= a[left] && x < a[mid]) {
                return search(a, left, mid -1, x);
            } else {
                return search(a, mid + 1, right, x);
            }
        }

        return -1;
    }


    public static boolean conditionMet(int[] arr, int ind, int nextInd)  {
        return arr[ind] > arr[nextInd];
    };
}
