package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5212JS {
    static int[] dx = {0, 1, 0, -1}; //오른쪽, 아래, 왼쪽, 위
    static int[] dy = {1, 0, -1, 0}; //오른쪽, 아래, 왼쪽, 위
    static int count;
    static String[][] originMaps;

    public static void check(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nextX = dx[k] + x;
            int nextY = dy[k] + y;

            if (
                nextX == -1 || nextX == originMaps.length ||
                nextY == -1 || nextY == originMaps[0].length ||
                originMaps[nextX][nextY].equals(".")
            )
                count += 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] maps = br.readLine().split(" ");
        int R = Integer.parseInt(maps[0]), C = Integer.parseInt(maps[1]);

        originMaps = new String[R][C];
        String[][] newMaps = new String[R][C];

        int minR = 10, minC = 10;
        int maxR = 0, maxC = 0;

        for (int i = 0; i < R; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < C; j++) {
                originMaps[i][j] = line[j];
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                count = 0;
                if (originMaps[i][j].equals("X")) {
                    check(i, j);
                    if (count >= 3) newMaps[i][j] = ".";
                    else {
                        newMaps[i][j] = "X";
                        maxR = Math.max(maxR, i);
                        minR = Math.min(minR, i);
                        maxC = Math.max(maxC, j);
                        minC = Math.min(minC, j);
                    }
                } else newMaps[i][j] = ".";
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = minR; i <= maxR; i++) {
            for (int j = minC; j <= maxC; j++) sb.append(newMaps[i][j]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
