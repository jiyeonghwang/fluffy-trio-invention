package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1780JY {
    static int[][] arr;
    static int num1=0;
    static int num2=0;
    static int num3=0;

    static void partition (int x, int y, int len) {
        if (!check(x, y, len)) {
            int newLen = len/3;
            partition(x, y, newLen);
            partition(x+newLen, y, newLen);
            partition(x+newLen*2, y, newLen);
            partition(x, y+newLen, newLen);
            partition(x+newLen, y+newLen, newLen);
            partition(x+newLen*2, y+newLen, newLen);
            partition(x, y+newLen*2, newLen);
            partition(x+newLen, y+newLen*2, newLen);
            partition(x+newLen*2, y+newLen*2, newLen);
        }
    }

    static boolean check (int x, int y, int len) {
        int target = arr[x][y];
        for (int i=x; i<x+len; i++) {
            for (int j=y; j<y+len; j++) {
                if (target != arr[i][j]) return false;
            }
        }

        if (target == -1) {
            num1++;
        } else if (target == 0) {
            num2++;
        } else {
            num3++;
        }

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
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
