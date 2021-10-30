package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2583DH {
    private static int[] dx = {0, 1, 0, -1}; //오른쪽, 아래, 왼쪽, 위
    private static int[] dy = {1, 0, -1, 0}; //오른쪽, 아래, 왼쪽, 위

    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i=0;i<k;i++) {
            st = new StringTokenizer(br.readLine());
            int xLeft = Integer.parseInt(st.nextToken());
            int yDown = Integer.parseInt(st.nextToken());
            int xRight = Integer.parseInt(st.nextToken());
            int yUp = Integer.parseInt(st.nextToken());

            for (int x=xLeft;x<xRight;x++) {
                for (int y=yDown;y<yUp;y++) {
                    map[y][x]=1;
                }
            }
        }

        visited = new boolean[n][m];
        int count = 0;

        List<Integer> answer = new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    answer.add(dfs(i, j));
                    //answer.add(bfs(i, j));
                    count++;
                }
            }
        }

        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        for (int i=0;i<answer.size();i++) {
            sb.append(answer.get(i)).append(" ");
        }

        System.out.println(sb);
    }

    public static int dfs(int i, int j) {
        int area = 1;
        visited[i][j] = true;

        for (int k=0;k<4;k++) {
            int nextI = dx[k]+i;
            int nextJ = dy[k]+j;

            if (nextI>=0 && nextI<map.length && nextJ>=0 && nextJ<map[0].length) {
                if (!visited[nextI][nextJ] && map[nextI][nextJ] == 0) {
                    area += dfs(nextI, nextJ);
                }
            }
        }
        return area;
    }

    public static int bfs(int i, int j) {
        int area = 1;
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
                    if (!visited[nextI][nextJ] && map[nextI][nextJ] == 0) {
                        queue.offer(new int[]{nextI, nextJ});
                        visited[nextI][nextJ] = true;
                        area++;
                    }
                }
            }
        }
        return area;
    }
}