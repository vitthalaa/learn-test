import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        char[] a = "Vitthal.".toCharArray();
        if (a[a.length-1] == '.') {
            a = Arrays.copyOfRange(a, 0, a.length-1);
        }

        for (int i = 0; i < a.length; i++) {
            if (i != 0 && i != (a.length - 1)) {
                a[i] = '*';
            }
        }

        System.out.println(new String(a));
    }

    public static int ciel(int dividend, int divisor) {
        return (int)Math.ceil(dividend/(float)divisor);
    }
}
