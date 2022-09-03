package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5212DH {
    private static final int[] dx = {0,1,0,-1};
    private static final int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int sizeI = Integer.parseInt(size[0]);
        int sizeJ = Integer.parseInt(size[1]);
        char[][] map = new char[sizeI][];
        char[][] newMap = new char[sizeI][sizeJ];

        for (int i=0;i<sizeI;i++) {
            map[i] = br.readLine().toCharArray();
        }

        int minI = Integer.MAX_VALUE;
        int maxI = Integer.MIN_VALUE;
        int minJ = Integer.MAX_VALUE;
        int maxJ = Integer.MIN_VALUE;

        for (int i=0;i<sizeI;i++) {
            for (int j=0;j<sizeJ;j++) {
                if (map[i][j] == 'X') {
                    int cnt = 0;
                    for (int k=0;k<4;k++) {
                        if (i+dx[k] >=0 && i+dx[k] < sizeI && j+dy[k] >=0 && j+dy[k] < sizeJ) {
                            if (map[i+dx[k]][j+dy[k]] == '.') {
                                cnt++;
                            }
                        } else {
                            cnt++;
                        }
                    }

                    if (cnt < 3) {
                        newMap[i][j] = map[i][j];

                        if (minI > i) {
                            minI = i;
                        }

                        if (maxI < i) {
                            maxI = i;
                        }

                        if (minJ > j) {
                            minJ = j;
                        }

                        if (maxJ < j) {
                            maxJ = j;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=minI;i<=maxI;i++) {
            for (int j=minJ;j<=maxJ;j++) {
                if (newMap[i][j] == 'X') {
                    sb.append(newMap[i][j]);
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
