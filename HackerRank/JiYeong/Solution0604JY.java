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
     * Complete the 'gamingArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static String gamingArray2(List<Integer> arr) {
        int play = 0;
        int idx = arr.size();

        while (idx > 0) {
            int max = 0;
            int tempIdx = 0;
            for (int i=0; i<idx; i++) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                    tempIdx = i;
                }
            }
            idx = tempIdx;
            play++;
        }

        if (play%2 == 0) return "ANDY";
        else return "BOB";
    }

    public static String gamingArray(List<Integer> arr) {
        // Write your code here
        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            queue.offer(i);
            stack.push(i);
        }

        int play = 0;
        int max = queue.poll();

        while (!stack.isEmpty()) {
            if (max != stack.peek()) {
                int target = stack.pop();
                queue.remove(target);
            } else {
                stack.pop();
                if (!queue.isEmpty()) {
                    max = queue.poll();
                    play++;
                }
            }
        }

        if (play%2==0) return "BOB";
        else return "ANDY";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = Result.gamingArray(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
