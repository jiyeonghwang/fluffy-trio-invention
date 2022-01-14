import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution0101DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }

    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            int positive = 0;
            int zero = 0;
            int negative = 0;

            for (Integer integer:arr) {
                if (integer.intValue() > 0) {
                    positive++;
                } else if (integer.intValue() < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }

            float sum = positive+zero+negative;
            System.out.println(String.format("%.6f", positive/sum));
            System.out.println(String.format("%.6f", negative/sum));
            System.out.println(String.format("%.6f", zero/sum));
        }

    }
}
