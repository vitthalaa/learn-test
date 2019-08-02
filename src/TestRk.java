import java.util.stream.IntStream;

class TestRk {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int possibleWays = 0;

        for (int i = 0; i <= A.length; i++) {
            //int[] arrayToCheck = removeTreeAtPosition(A, i);
            /*if (isAscendingOrder(arrayToCheck, arrayToCheck.length)) {
                possibleWays++;
            }*/
            boolean isSorted = true;
            for (int j = i+1; j < A.length - 2; j++) {
                if (A[j] > A[j+1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                possibleWays++;
            }
        }

        return possibleWays;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 5, 4};
        int[] B = {4, 5, 2, 3, 4};

        int p = solution(A);

        System.out.println(p);
    }

    private static int[] removeTreeAtPosition(int[] A, int position) {
        if (A == null || position < 0 || position >= A.length) {
            return A;
        }

        return IntStream.range(0, A.length)
            .filter(i -> i != position)
            .map(i -> A[i])
            .toArray();

        /*int[] copiedArray = new int[A.length - 1];
        for (int i = 0, k = 0; i < A.length; i++) {

            // if the index is
            // the removal element index
            if (i == position) {
                continue;
            }

            // if the index is not
            // the removal element index
            copiedArray[k++] = A[i];
        }

        // return the resultant array
        return copiedArray;*/

    }

    private static boolean isAscendingOrder(int[] A, int n) {

        if (n == 0 || n == 1) {
            return true;
        }

        if (A[n - 1] < A[n - 2]) {
            return false;
        }

        return isAscendingOrder(A, n -1);
    }
}