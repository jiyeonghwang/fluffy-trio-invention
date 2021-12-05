package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1026DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            firstArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            secondArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += (firstArr[i]*secondArr[n-1-i]);
        }

        System.out.println(sum);
    }
}

