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

class Result {

    /*
     * Complete the 'sansaXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int sansaXor(List<Integer> arr) {
        // Write your code here
//        List<List<Integer>> temp = new ArrayList<>();
//        for (int i=1; i<=arr.size(); i++) {
//            int st=0;
//            for (int j=0; j+i<=arr.size(); j++) {
//                List<Integer> subList = arr.subList(st, i+j);
//                temp.add(subList);
//                st++;
//            }
//        }
//
//        int result = temp.get(0).get(0);
//        temp.remove(0);
//        for (List<Integer> list : temp) {
//            int x = list.get(0);
//            for (int i=1; i<list.size(); i++) {
//                x ^= list.get(i);
//            }
//            result ^= x;
//        }
//        return result;

        if (arr.size()%2 == 0) return 0;

        int answer =0;
        for(int i=0; i<arr.size(); i+=2){
            answer = answer ^ arr.get(i);
        }
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                int result = Result.sansaXor(arr);

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
