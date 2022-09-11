package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main21921DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalDays = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int[] visits = new int[totalDays];
        st = new StringTokenizer(br.readLine());

        for (int i=0;i<totalDays;i++) {
            visits[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = length-1;

        int sum = 0;
        for (int i=0;i<length;i++) {
            sum += visits[i];
        }

        int max = sum;
        int maxCount = 1;
        while (end < visits.length-1) {
            sum -= visits[start];
            start++;
            end++;
            sum += visits[end];

            if (max < sum) {
                max = sum;
                maxCount = 1;
            } else if (max == sum) {
                maxCount++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max+"\n"+maxCount);
        }
    }
}
