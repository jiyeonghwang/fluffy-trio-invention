package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sangGeun = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            sangGeun[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sangGeun);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<m;i++) {
            int tmp = Integer.parseInt(st.nextToken());

            if (contains(sangGeun, tmp)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }

    public static boolean contains(int[] arr, int item) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (arr[mid] == item) {
                return true;
            } else if (arr[mid] < item) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return false;
    }
}