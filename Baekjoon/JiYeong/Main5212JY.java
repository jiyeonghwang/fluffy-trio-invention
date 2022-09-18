package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5212JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int[] di = {0, 1, 0, -1};
        int[] dj = {1, 0, -1, 0};

        int minR = 10, minC = 10;
        int maxR = 0, maxC = 0;

        char[][] after = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X') {
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int x = i + di[k];
                        int y = j + dj[k];

                        if ((x == -1 || y == -1 || x == R || y == C) || map[x][y] == '.') {
                            cnt++;
                        }
                    }

                    if (cnt < 3) {
                        after[i][j] = 'X';

                        minR = Math.min(minR, i);
                        minC = Math.min(minC, j);
                        maxR = Math.max(maxR, i);
                        maxC = Math.max(maxC, j);
                    } else {
                        after[i][j] = '.';
                    }
                } else {
                    after[i][j] = '.';
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = minR; i <= maxR; i++) {
            for (int j = minC; j <= maxC; j++) {
                answer.append(after[i][j]);
            }
            answer.append("\n");
        }

        System.out.println(answer);
    }
}