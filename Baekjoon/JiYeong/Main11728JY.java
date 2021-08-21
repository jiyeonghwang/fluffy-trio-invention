package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11728JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());
        int[] a = new int[aSize];
        int[] b = new int[bSize];
        int tempA = 0, tempB = 0, temp=0;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<aSize; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<bSize; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);
        StringBuilder sb = new StringBuilder();

        while (tempA<aSize && tempB<bSize) {
            if(a[tempA]<b[tempB]) sb.append(a[tempA++] + " ");
            else sb.append(b[tempB++] + " ");
        }

        while(tempA<aSize) sb.append(a[tempA++] + " ");
        while(tempB<bSize) sb.append(b[tempB++] + " ");

        System.out.println(sb.toString());
    }
}
