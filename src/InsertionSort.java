import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 4, 9, 3};
        System.out.println("Before sort:" + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After sort:" + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];

            int j;
            for (j = i; j > 0 && arr[j-1] > valueToSort; j--) {
                arr[j] = arr[j-1];
            }

            arr[j] = valueToSort;
        }
    }
}
