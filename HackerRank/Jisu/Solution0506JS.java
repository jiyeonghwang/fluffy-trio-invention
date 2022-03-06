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

class Solution0506JS {

    /*
     * Complete the 'countSort' function below.
     *
     * The function accepts 2D_STRING_ARRAY arr as parameter.
     */

    public static void countSort(List<List<String>> arr) {
        // Write your code here
        int mid = arr.size()/2;
        StringBuffer[] tmp = new StringBuffer[100];
        for(int i=0;i<100;i++){
            tmp[i]=new StringBuffer();
        }

        for(int i=0; i<arr.size(); i++) {
            int key = Integer.parseInt(arr.get(i).get(0));
            String value;
            if(i<mid) value = "- ";
            else value = arr.get(i).get(1)+" ";
            tmp[key].append(value);
        }

        for(StringBuffer val:tmp){
            System.out.print(val);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        countSort(arr);

        bufferedReader.close();
    }
}
