package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630JY2 {
    static int[][] arr;
    static int white=0;
    static int blue=0;

    static void partition (int x, int y, int len) {
        if (!check(x, y, len)) {
            partition(x, y, len/2);
            partition(x+len/2, y, len/2);
            partition(x, y+len/2, len/2);
            partition(x+len/2, y+len/2, len/2);
        }
    }

    static boolean check (int x, int y, int len) {
        int target = arr[x][y];
        for (int i=x; i<x+len; i++) {
            for (int j=y; j<y+len; j++) {
                if (target != arr[i][j]) return false;
            }
        }

        if (target==1) blue++;
        if (target==0) white++;

        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        arr = new int[cnt][cnt];
        for (int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j=0;
            while (st.hasMoreTokens()) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        partition(0, 0, cnt);
        System.out.println(white);
        System.out.println(blue);
    }
}
