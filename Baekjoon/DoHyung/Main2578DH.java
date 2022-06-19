package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2578DH {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = 5;
        int count = 0;

        Map<Integer, int[]> board = new HashMap<Integer, int[]>();
        boolean[][] check = new boolean[length][length];

        for (int i=0;i<length;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<length;j++) {
                board.put(Integer.parseInt(st.nextToken()), new int[]{i, j});
            }
        }

        for (int i=0;i<length;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<length;j++) {
                int[] coor = board.get(Integer.parseInt(st.nextToken()));
                check[coor[0]][coor[1]] = true;
                count++;

                if (count >= 12) {
                    if (checkBoard(check, coor[0], coor[1])) {
                        System.out.println(count);
                        return;
                    };
                }
            }
        }

        System.out.println(count);
    }

    public static boolean checkBoard(boolean[][] check, int i, int j) {
        boolean result = false;
        int count = 0;

        if (check[0][0] && check[1][1] && check[2][2] && check[3][3] && check[4][4]) {
            count++;
        }

        if (check[0][4] && check[1][3] && check[2][2] && check[3][1] && check[4][0]) {
            count++;
        }

        boolean rowCheck = true;
        boolean colCheck = true;
        for (int a=0;a<5;a++) {
            for (int b=0;b<5;b++) {
                rowCheck = rowCheck && check[a][b];
                colCheck = colCheck && check[b][a];
            }
            if (rowCheck) {
                count++;
            }
            if (colCheck) {
                count++;
            }

            rowCheck = true;
            colCheck = true;
        }

        if (count >= 3) {
            result = true;
        }

        return  result;
    }
}
