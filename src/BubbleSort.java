import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 4, 9, 3};
        System.out.println("Before sort:" + Arrays.toString(arr));

        bubbleSort(arr, arr.length);

        System.out.println("After sort:" + Arrays.toString(arr));
    }


    static void bubbleSort(int[] a, int n) {
        int i, j, temp;
        int flag = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < (n-i-1); j++) {
                flag = 0;

                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = 1;
                }
            }

            if (flag == 0)
            {
                break;
            }
        }

        return;
    }
}
