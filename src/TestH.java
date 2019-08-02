import java.util.Arrays;
import java.util.Scanner;

public class TestH {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int testCases = Integer.parseInt(s.nextLine());
        String stringNumbers[] = s.nextLine().split(" ");
        for (int i = 0; i < testCases; i ++) {
            if (i == stringNumbers.length) {
                break;
            }

            if (stringNumbers[i] == null || stringNumbers[i].trim().length() == 0) {
                continue;
            }

            Integer number = Integer.parseInt(stringNumbers[i]);
            printNumbers(number);
        }

    }

    private static void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }

            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }
    }
}

