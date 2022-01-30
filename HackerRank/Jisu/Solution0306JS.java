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

class Solution0306JS {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List<Integer> answer = new ArrayList<>();
        Collections.sort(sticks);
        long max = 0;
        for(int i=0; i<sticks.size()-2; i++){
            int a = sticks.get(i);
            int b = sticks.get(i+1);
            int c = sticks.get(i+2);
            if(a+b>c && a+c>b && b+c>a){
                long sum = (long)a+b+c;
                if(max<sum) {
                    max = sum;
                    answer.clear();
                    answer.add(a);
                    answer.add(b);
                    answer.add(c);
                }
            }
        }
        if (answer.size()==0) answer.add(-1);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
