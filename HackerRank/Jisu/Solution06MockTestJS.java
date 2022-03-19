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

public class Solution06MockTestJS {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        // Write your code here
        boolean isPalindrome = true;
        int start = 0, end = s.length()-1;

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                isPalindrome = false;
                start = i;
                end = s.length()-i-1;
                break;
            }
        }
        if(isPalindrome) return -1;

        int left = start, right = end;
        start+=1;
        while (start<end){
            if(s.charAt(start) != s.charAt(end)) return right;
            start+=1;
            end -=1;
        }

        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
