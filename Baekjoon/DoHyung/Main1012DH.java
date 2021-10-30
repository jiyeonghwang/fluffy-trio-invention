package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1012DH {
    private static int[] dx = {0, 1, 0, -1}; //오른쪽, 아래, 왼쪽, 위
    private static int[] dy = {1, 0, -1, 0}; //오른쪽, 아래, 왼쪽, 위

    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nOfInput = Integer.parseInt(br.readLine());

        for (int a=0;a<nOfInput;a++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            map = new int[n][m];
            for (int i=0;i<k;i++) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            visited = new boolean[n][m];
            int count = 0;

            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        //dfs(i, j);
                        bfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int i, int j) {
        visited[i][j] = true;

        for (int k=0;k<4;k++) {
            int nextI = dx[k]+i;
            int nextJ = dy[k]+j;

            if (nextI>=0 && nextI<map.length && nextJ>=0 && nextJ<map[0].length) {
                if (!visited[nextI][nextJ] && map[nextI][nextJ] == 1) {
                    dfs(nextI, nextJ);
                }
            }
        }
    }

    public static void bfs(int i, int j) {
        visited[i][j] = true;

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{i,j});

        while (!queue.isEmpty()) {
            int[] index = queue.poll();
            i = index[0];
            j = index[1];

            for (int k=0;k<4;k++) {
                int nextI = dx[k]+i;
                int nextJ = dy[k]+j;

                if (nextI>=0 && nextI<map.length && nextJ>=0 && nextJ<map[0].length) {
                    if (!visited[nextI][nextJ] && map[nextI][nextJ] == 1) {
                        queue.offer(new int[]{nextI, nextJ});
                        visited[nextI][nextJ] = true;
                    }
                }
            }
        }
    }
}
