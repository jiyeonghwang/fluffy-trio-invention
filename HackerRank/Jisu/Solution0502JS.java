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

class Solution0502JS {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int numberCount = 0, upperCount =0, lowerCount =0, specialCount =0;
        for(char x:password.toCharArray()){
            if(Character.isDigit(x)) numberCount +=1;
            else if(Character.isUpperCase(x)) upperCount+=1;
            else if(Character.isLowerCase(x)) lowerCount+=1;
            else specialCount+=1;
        }

        int answer = 0;
        if(numberCount ==0) answer+=1;
        if(upperCount ==0) answer+=1;
        if(lowerCount ==0) answer+=1;
        if(specialCount ==0) answer+=1;

        if(answer+password.length() < 6) answer = 6 -password.length();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
