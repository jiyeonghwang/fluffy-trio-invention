package JiYeong;

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

public class Test {
    public static void countSort2(List<List<String>> arr) {
        // Write your code here
        List<String>[] result = new ArrayList[100];

        for (int i=0; i<arr.size(); i++) {
            List<String> target = arr.get(i);
            int index = Integer.parseInt(target.get(0));

            List<String> temp = new ArrayList();
            if (result[index] != null) {
                temp = result[index];
            }

            if (arr.size()/2 > i) {
                temp.add("-");
            } else {
                temp.add(target.get(1));
            }
            result[index] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<result.length; i++) {
            List<String> target = result[i];
            if (target != null) {
                for (String s : target) {
                    sb.append(s);
                    sb.append(" ");
                }
            }
        }

        System.out.print(sb.toString());
    }

    public static void countSort(List<List<String>> arr) {
        // Write your code here
        List<String>[] result = new ArrayList[100];

        for (int i=0; i<arr.size()/2; i++) {
            arr.get(i).remove(1);
            arr.get(i).add("-");
        }

        arr.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                int x = Integer.parseInt(o1.get(0));
                int y = Integer.parseInt(o2.get(0));
                if (x>y) return 1;
                if (x==y) return 0;
                else return -1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (List<String> list : arr) {
            sb.append(list.get(1) + " ");
        }
        System.out.println(sb.toString());
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

        Test.countSort(arr);

        bufferedReader.close();
    }
}
