package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1654JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int have = Integer.parseInt(s[0]);
        int cnt = Integer.parseInt(s[1]);
        int[] arr = new int[cnt];
        long max = 0, min = 0, mid = 0;

        for (int i=0; i<have; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max++;
        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;

            for (int i = 0; i<arr.length; i++) {
                count += (arr[i] / mid);
            }
            if(count < cnt) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min-1);
    }
}
