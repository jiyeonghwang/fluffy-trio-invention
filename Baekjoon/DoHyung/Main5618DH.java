package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main5618DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for (int i=0;i<n;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=nums[0];i++) {
            if (nums[0]%i == 0 && nums[1]%i == 0) {
                if (n == 3) {
                    if (nums[2]%i == 0) {
                        sb.append(i+"\n");
                    }
                } else {
                    sb.append(i+"\n");
                }
            }
        }

        System.out.println(sb);
    }
}
