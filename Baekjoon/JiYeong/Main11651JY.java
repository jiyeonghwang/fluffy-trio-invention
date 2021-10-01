package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main11651JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt][2];
        for (int i=0; i<cnt; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(arr, (i, j) -> {
            if (i[1] == j[1]) {
                return Integer.compare(i[0], j[0]);
            } else {
                return Integer.compare(i[1], j[1]);
            }
        });
        for (int i=0; i<cnt; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
