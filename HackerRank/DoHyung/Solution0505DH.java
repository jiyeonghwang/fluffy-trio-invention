import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution0505DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        List<Integer> result = Result.missingNumbers(arr, brr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'missingNumbers' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arr
         *  2. INTEGER_ARRAY brr
         */

        public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
            Map<Integer, Integer> aMap = new HashMap<Integer, Integer>();

            for (int i=0;i<arr.size();i++) {
                aMap.put(arr.get(i), aMap.getOrDefault(arr.get(i),0)+1);
            }

            Map<Integer, Integer> bMap = new HashMap<Integer, Integer>();

            for (int i=0;i<arr.size();i++) {
                bMap.put(arr.get(i), bMap.getOrDefault(arr.get(i),0)+1);
            }

            List<Integer> answer = new ArrayList<Integer>();
            Iterator<Integer> iter = bMap.keySet().iterator();
            while (iter.hasNext()) {
                int num = iter.next();
                if (aMap.get(num) == null || aMap.get(num) < bMap.get(num)) {
                    answer.add(num);
                }
            }

            Collections.sort(answer);
            return answer;
        }

    }

}
