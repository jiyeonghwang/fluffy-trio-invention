package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1012JY {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    static int[][] map;
    static boolean[][] visited;

    static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int i=0; i<4; i++) {
            int nx = dx[i]+x;
            int ny = dy[i]+y;
            if (nx>=0 && nx<map.length && ny>=0 && ny<map[0].length) {
                if(!visited[nx][ny] && map[nx][ny]==1) {
                    DFS(nx, ny);
                }
            }
        }
    }

    static void BFS(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] index = queue.poll();
            x = index[0];
            y = index[1];

            for (int k=0; k<4; k++) {
                int nx = dx[k]+x;
                int ny = dy[k]+y;
                if (nx>=0 && nx<map.length && ny>=0 && ny<map[0].length) {
                    if(!visited[nx][ny] && map[nx][ny]==1) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; i++) {
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);

            map = new int[m][n];
            visited = new boolean[m][n];

            for (int j=0; j<k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int count = 0;
            for (int x=0; x<m; x++) {
                for (int y=0; y<n; y++) {
                    if (!visited[x][y] && map[x][y] == 1) {
                        //DFS(x, y);
                        BFS(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
