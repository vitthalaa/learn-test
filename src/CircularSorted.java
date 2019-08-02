/*Check if an array is circularly sorted.
Given an array of N distinct integers.
The task is to write a program to check if this array is circularly sorted.
An array is circularly sorted if its elements are sorted except
for a rotation.*/

/**
    Input : { 1, 2, 3, 4, 5 }
    Output : True

    Input : { 3, 4, 5, 1, 2 }
    Output : True

    INput: {1, 2, 6, 7, 4}
    Output :True

    INput: {1, 2, 4, 3, 7, 6}
    Output :False

    Input: {6, 1, 2, 3, 4}

    Input: {6, 1, 2, 3, 7}
 **/

class CircularSorted {
    public boolean checkSorted (int array[]) {
            int totalSorted = 0;

            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] < array[i+1]) {
                    totalSorted++;
                    continue;
                }

                if (totalSorted < 1 && i != 0) {
                    return false;
                }

                totalSorted = 0;
            }

            if (totalSorted <= 1) {
                return false;
            }

            return true;
    }
}

