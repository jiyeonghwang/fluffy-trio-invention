package Jisu;

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

class Solution0404JS {

    /*
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
        // Write your code here
        String answer = "NO";

        StringBuilder tmpSb = new StringBuilder();
        long num = 1;
        for (int i = 1; i <= s.length() / 2; i++) {
            tmpSb.append(s, 0, i);
            num = Long.parseLong(tmpSb.toString());

            long tmp = num;
            while (tmpSb.length() < s.length()) {
                tmpSb.append(++tmp);
            }

            if(tmpSb.toString().equals(s)){
                answer = "YES";
                break;
            } else tmpSb = new StringBuilder();
        }

        if(! tmpSb.toString().equals(s)) answer = "NO";

        if(answer.equals("YES")) System.out.println(answer+" "+num);
        else System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
