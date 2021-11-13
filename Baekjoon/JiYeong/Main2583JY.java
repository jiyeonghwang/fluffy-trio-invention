package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2583JY {
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    static int[][] map;
    static boolean[][] visited;
    static int count = 1;

    static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int k=0; k<4; k++) {
            int nx = dx[k]+x;
            int ny = dy[k]+y;
            if (nx>=0 && nx<map.length && ny>=0 && ny<map[0].length) {
                if (!visited[nx][ny] && map[nx][ny] == 0) {
                    count++;
                    DFS(nx, ny);
                }
            }
        }
    }

    static void BFS(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] index = queue.poll();
            x = index[0];
            y = index[1];

            for (int k=0; k<4; k++) {
                int nx = dx[k]+x;
                int ny = dy[k]+y;
                if (nx>=0 && nx<map.length && ny>=0 && ny<map[0].length) {
                    if(!visited[nx][ny] && map[nx][ny]==0) {
                        count++;
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);

        map = new int[m][n];
        visited = new boolean[m][n];

        for (int i=0; i<k; i++) {
            String[] coordinate = br.readLine().split(" ");
            int lx = Integer.parseInt(coordinate[0]);
            int ly = Integer.parseInt(coordinate[1]);
            int rx = Integer.parseInt(coordinate[2]);
            int ry = Integer.parseInt(coordinate[3]);

            for(int x=lx; x<rx; x++){
                for(int y=ly; y<ry; y++){
                    map[y][x] = 1;
                }
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue();
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    //DFS(i, j);
                    BFS(i, j);
                    q.add(count);
                    count = 1;
                }
            }
        }

        System.out.println(q.size());
        while (!q.isEmpty()) {
            System.out.print((q.poll()) + " ");
        }
    }
}
