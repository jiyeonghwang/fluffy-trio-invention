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

public class Solution0306DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }


    class Result {

        /*
         * Complete the 'maximumPerimeterTriangle' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY sticks as parameter.
         */

        public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
            Collections.sort(sticks);

            List<Integer> answer = new ArrayList<Integer>();

            for (int i=sticks.size()-1;i>=2;i--) {
                if (sticks.get(i)+sticks.get(i-1) > sticks.get(i-2)
                        && sticks.get(i-2)+sticks.get(i) > sticks.get(i-1)
                        && sticks.get(i-1)+sticks.get(i-2) > sticks.get(i)) {

                    answer.add(sticks.get(i-2));
                    answer.add(sticks.get(i-1));
                    answer.add(sticks.get(i));
                    break;
                }
            }

            if (answer.size() == 0) {
                answer.add(-1);
            }

            return answer;
        }

    }
}
