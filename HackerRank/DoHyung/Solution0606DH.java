import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution0606DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'superDigit' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING n
         *  2. INTEGER k
         */

        public static int superDigit(String n, int k) {
            long sum = 0;
            for (char c:n.toCharArray()) {
                sum += Character.getNumericValue(c);
            }

            String str = String.valueOf(sum*k);

            while (true) {
                sum = 0;
                for (char c:str.toCharArray()) {
                    sum += Character.getNumericValue(c);
                }
                str = String.valueOf(sum);

                if (str.length() == 1) {
                    break;
                }
            }

            return Integer.parseInt(str);
        }
    }
}
