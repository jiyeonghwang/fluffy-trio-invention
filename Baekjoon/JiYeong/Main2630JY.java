package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630JY {
    public static int white = 0;
    public static int blue = 0;
    public static int[][] arr;

    public static void partition(int row, int col, int size) {
        if(colorCheck(row, col, size)) {
            if(arr[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }
        int newSize = size / 2;
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = arr[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(arr[i][j] != color) {
                    return false;
                }
            }
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

        System.out.println(white);
        System.out.println(blue);
    }
}
