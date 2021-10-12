package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        for (int i=0;i<board.length;i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            for (int j=0;j<board.length;j++) {
                if (input.nextToken().equals("1")) {
                    board[i][j] = 1;
                }
            }
        }

        int check = check(n, board, 0, 0);
        if (check == 0) {
            System.out.println("1\n0");
            return;
        } else if (check == 1) {
            System.out.println("0\n1");
            return;
        }

        int[] result = cut(n, board, 0, 0);
        System.out.println(result[0]+"\n"+result[1]);

    }

    public static int[] cut(int n, int[][] board, int i, int j) {
        int white = 0;
        int blue = 0;

        int[] iIdx = {i, i, i+n/2, i+n/2};
        int[] jIdx = {j, j+n/2, j, j+n/2};

        for (int k=0;k<4;k++) {
            int result = check(n/2, board, iIdx[k], jIdx[k]);
            if (result == 0) {
                white++;
            } else if (result == 1) {
                blue++;
            } else {
                int[] tmp = cut(n/2, board, iIdx[k], jIdx[k]);
                white+=tmp[0];
                blue+=tmp[1];
            }
        }

        return new int[]{white, blue};
    }

    public static int check(int n, int[][] board, int i, int j) {
        int value = board[i][j];

        for (int x=i;x<i+n;x++) {
            for (int y=j;y<j+n;y++) {
                if (value != board[x][y]) {
                    return -1;
                }
            }
        }

        return value;
    }
}