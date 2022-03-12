import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution0603DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> s = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int sItem = Integer.parseInt(sTemp[i]);
                s.add(sItem);
            }

            String result = Result.misereNim(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'misereNim' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts INTEGER_ARRAY s as parameter.
         */

        public static String misereNim(List<Integer> s) {
            int checkOne = 1;
            int checkBalance = 0;
            for (int i=0;i<s.size();i++) {
                checkOne *= s.get(i);
                checkBalance ^= s.get(i);
            }

            if (checkOne == 1) {
                if (s.size() % 2 == 1) {
                    return "Second";
                } else {
                    return "First";
                }
            }

            if (checkBalance == 0) {
                return "Second";
            } else {
                return "First";
            }
        }

    }

}
