package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main2210DH {
    private static Set<String> set = new HashSet<String>();
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[5][5];

        for (int i=0;i<board.length;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<board[0].length;j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                getNumbers(board, i, j, "");
            }
        }

        System.out.println(set.size());
    }

    public static void getNumbers(int[][] board, int i, int j, String num) {
        num += board[i][j];

        if (num.length() == 6) {
            set.add(num);
            return;
        }

        for (int k=0;k<4;k++) {
            if (i+dx[k] >= 0 && i+dx[k] < board.length && j+dy[k] >= 0 && j+dy[k] < board.length){
                getNumbers(board, i+dx[k], j+dy[k], num);
            }
        }
    }
}
