package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1940DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int one = 0;
        int two = n-1;

        int answer = 0;
        while (one<two) {
            if (arr[one]+arr[two] == k) {
                answer++;
                one++;
                two--;
            } else if (arr[one]+arr[two] < k) {
                one++;
            } else if (arr[one]+arr[two] > k) {
                two--;
            }
        }

        System.out.println(answer);
    }

}

