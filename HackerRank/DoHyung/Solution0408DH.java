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

public class Solution0408DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'caesarCipher' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s
         *  2. INTEGER k
         */

        public static String caesarCipher(String s, int k) {
            StringBuilder answer = new StringBuilder();
            k=k%26;

            for (int i=0;i<s.length();i++) {
                char c = s.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    answer.append((char)(((c+k)>'z')?c+k-26:c+k));
                } else if (c >= 'A' && c <= 'Z') {
                    answer.append((char)(((c+k)>'Z')?c+k-26:c+k));
                } else {
                    answer.append((char)c);
                }
            }

            return answer.toString();
        }

    }
}
