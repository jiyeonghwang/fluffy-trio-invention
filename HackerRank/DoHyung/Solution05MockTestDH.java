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

public class Solution05MockTestDH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new
                FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput =
                bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int t1 = Integer.parseInt(firstMultipleInput[0]);
        int t2 = Integer.parseInt(firstMultipleInput[1]);
        int n = Integer.parseInt(firstMultipleInput[2]);
        BigInteger result = Result.fibonacciModified(t1, t2, n);
        bufferedWriter.write(result.toString());
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {
        /*
         * Complete the 'fibonacciModified' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         * 1. INTEGER t1
         * 2. INTEGER t2
         * 3. INTEGER n
         */
        public static BigInteger fibonacciModified(int t1, int t2, int n) {
            return fibonacci(new BigInteger(String.valueOf(t1)),new
                    BigInteger(String.valueOf(t2)), n-2);
        }

        public static BigInteger fibonacci(BigInteger t1, BigInteger t2, int n) {
            if (n == 1) {
                return t1.add(t2.multiply(t2));
            } else {
                return fibonacci(t2, t1.add(t2.multiply(t2)), n-1);
            }
        }
    }
}