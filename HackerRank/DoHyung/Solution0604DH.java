import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution0604DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < arrCount; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            String result = Result.gamingArray(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'gamingArray' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static String gamingArray(List<Integer> arr) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i=0;i<arr.size();i++) {
                map.put(arr.get(i), i);
            }

            Collections.sort(arr);

            int turns = 0;
            int lastIdx = Integer.MAX_VALUE;
            for (int i=arr.size()-1;i>=0;i--) {
                if (lastIdx < map.get(arr.get(i))) {
                    continue;
                }

                if (lastIdx > map.get(arr.get(i))) {
                    turns++;
                    lastIdx = map.get(arr.get(i));
                }

                if (arr.get(i) == 0) {
                    break;
                }
            }

            if (turns%2 == 0) {
                return "ANDY";
            } else {
                return "BOB";
            }

        }

    }

}
