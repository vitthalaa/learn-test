import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStreak {
    /*
     * Complete the 'findMatrix' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY a as parameter.
     */

    public static List<List<Integer>> findMatrix(List<List<Integer>> a) {
        List<List<Integer>> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            List<Integer> bForI = new ArrayList();
            for (int j = 0; j < a.get(i).size(); j++) {
                bForI.add(getB(i, j, a));
            }

            b.add(bForI);
        }

        return b;
    }

    public static int getB(int x, int y, List<List<Integer>> a) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                sum += a.get(i).get(j);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList();
        List<Integer> j = Arrays.asList(1, 2);
        a.add(j);
        j = Arrays.asList(3, 4);
        a.add(j);

        List<List<Integer>> b = findMatrix(a);

        System.out.println("Over");
    }
}

    /*function substringCalculator($s) {
        int count = 0;
        $stringToPerform = $s;
        for ($i = 0; $i < strlen($s); $i++) {
            for ($j = strlen($stringToPerform) - 1; $j = 0; $j--) {
                count++;
            }

            $stringToPerform
        }

    }*/