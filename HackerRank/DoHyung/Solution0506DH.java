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

public class Solution0506DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        String[] inputArr = new String[n];

        for (int i=0;i<inputArr.length;i++) {
            inputArr[i] = bufferedReader.readLine();
        }

        Result.countSort(inputArr);

        bufferedReader.close();
    }

    class Result {

        /*
         * Complete the 'countSort' function below.
         *
         * The function accepts 2D_STRING_ARRAY arr as parameter.
         */

        public static void countSort(String[] arr) {
            //Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
            StringBuilder[] map = new StringBuilder[100];

            for (int i=0;i<arr.length/2;i++) {
                String[] tmp = arr[i].split(" ");
                int key = Integer.parseInt(tmp[0]);
                if (map[key] == null) {
                    map[key] = new StringBuilder("- ");
                } else {
                    map[key].append("- ");
                }
            }

            for (int i=arr.length/2;i<arr.length;i++) {
                String[] tmp = arr[i].split(" ");
                int key = Integer.parseInt(tmp[0]);
                if (map[key] == null) {
                    map[key] = new StringBuilder(tmp[1]+" ");
                } else {
                    map[key].append(tmp[1]+" ");
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i=0;i<map.length;i++) {
                if (map[i] != null) {
                    sb.append(map[i].toString().trim());
                    sb.append(" ");
                }
            }

            System.out.print(sb.toString().trim());
        }

    }

}
