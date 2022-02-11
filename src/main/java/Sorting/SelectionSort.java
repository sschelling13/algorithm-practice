package Sorting;

public class SelectionSort {

    int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;

            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

        return arr;
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
