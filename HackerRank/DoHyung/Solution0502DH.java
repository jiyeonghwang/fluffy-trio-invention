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

public class Solution0502DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'minimumNumber' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. STRING password
         */

        public static int minimumNumber(int n, String password) {
            int length = n;

            if (password.replaceAll("[^0-9]","").length() == 0) {
                length++;
            }

            if (password.replaceAll("[^a-z]","").length() == 0) {
                length++;
            }

            if (password.replaceAll("[^A-Z]","").length() == 0) {
                length++;
            }

            if (password.replaceAll("[^!@#$%^&*()+-]","").length() == 0) {
                length++;
            }

            if (length < 6) {
                return 6-n;
            } else {
                return length-n;
            }
        }

    }

}
