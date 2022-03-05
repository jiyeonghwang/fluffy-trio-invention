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

public class Solution0404DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    class Result {

        /*
         * Complete the 'separateNumbers' function below.
         *
         * The function accepts STRING s as parameter.
         */

        public static void separateNumbers(String s) {
            for (int i=1;i<=s.length()/2;i++) {
                long num = Long.parseLong(s.substring(0,i));
                long first = num;
                StringBuilder sb = new StringBuilder();
                while (sb.length() < s.length()) {
                    sb.append(num++);
                }

                if (s.equals(sb.toString())) {
                    System.out.println("YES "+first);
                    return;
                }
            }

            System.out.println("NO");
        }

    }

}
