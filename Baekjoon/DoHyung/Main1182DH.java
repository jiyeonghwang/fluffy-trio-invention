package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1182DH {
    private static int n;
    private static int sum;
    private static int[] nums;
    private static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        sum = Integer.parseInt(st.nextToken());

        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        add(0,0);
        if (sum == 0) {
            count--;
        }

        System.out.println(count);
    }

    public static void add(int counted, int total) {
        if (counted == n) {
            if (total == sum) {
                count++;
            }
            return;
        }
        add(counted+1,total);
        add(counted+1,total+nums[counted]);
    }
}

