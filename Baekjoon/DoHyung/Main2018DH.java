package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2018DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        for (int i=0;i<=n;i++) {
            arr[i] = i;
        }

        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            if (sum > n) {
                sum -= arr[start];
                start++;
            } else if (end > n){
                break;
            } else {
                sum += arr[end];
                end++;
            }

            if (sum == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
