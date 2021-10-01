package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1654DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lines = new int[m];
        int max = Integer.MIN_VALUE;
        for (int i=0;i<m;i++) {
            lines[i] = Integer.parseInt(br.readLine());

            if (lines[i] > max) {
                max = lines[i];
            }
        }

        long lt = 1;
        long rt = max;

        long answer = 0;
        while (lt <= rt) {
            long mid = (lt+rt)/2;
            int count = cut(lines, mid);

            if (count >= n) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        System.out.println(answer);
    }

    public static int cut(int[] lines, long length) {
        int count = 0;

        for (int i=0;i<lines.length;i++) {
            count += lines[i]/length;
        }

        return count;
    }
}