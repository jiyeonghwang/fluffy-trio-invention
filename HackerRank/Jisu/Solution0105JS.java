package Jisu;

import java.io.*;
import java.util.*;

public class Solution0105JS {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputList = new ArrayList<>();

        while(true){
            String input = br.readLine();
            if(input == null) break;
            inputList.add(input);
        }

        for (String input:inputList){
            String[] split = input.split(";");
            char[] charArr = split[2].toCharArray();
            StringBuilder result = new StringBuilder();

            int startIdx = 0;
            if(split[0].equals("S")){
                if (split[1].equals("C")) {
                    startIdx = 1;
                    result.append(Character.toLowerCase(charArr[0]));
                }
                for (int i=startIdx; i<charArr.length; i++){
                    char c = charArr[i];
                    if (! Character.isAlphabetic(c)) break;
                    if(Character.isUpperCase(c)) result.append(" ").append(Character.toLowerCase(c));
                    else result.append(c);
                }
            } else{
                if (split[1].equals("C")) {
                    startIdx = 1;
                    result.append(Character.toUpperCase(charArr[0]));
                }
                for (int i=startIdx; i<charArr.length; i++){
                    char c = charArr[i];
                    if(c==' ') {
                        result.append(Character.toUpperCase(charArr[i+1]));
                        charArr[i+1] = '-';
                    }
                    else if(c=='-') continue;
                    else result.append(c);
                }
                if (split[1].equals("M")) {
                    result.append("(").append(")");
                }
            }
            System.out.println(result);
        }
    }
}