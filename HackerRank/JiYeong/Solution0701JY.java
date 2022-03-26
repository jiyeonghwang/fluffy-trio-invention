import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Bomb {
    int x;
    int y;

    Bomb(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Result {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid) {
        // Write your code here
        int[][] check = new int[grid.size()][grid.get(0).length()];
        for (int i=0; i<grid.size(); i++) {
            char[] arr = grid.get(i).toCharArray();
            for (int j=0; j<grid.get(0).length(); j++) {
                if (arr[j]=='O') check[i][j] = 2;
                else check[i][j] = 0;
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        if (n > 5){
            n = ( (n-3) % 4 ) + 3;
        }
        for (int i=1; i<n; i++) {
            if(i%2 == 1) {
                for (int x=0; x< grid.size(); x++) {
                    for (int y=0; y<grid.get(0).length(); y++) {
                        if (check[x][y] == 0) check[x][y] = 3;
                        else {
                            check[x][y]--;
                        }
                    }
                }
            } else {
                boolean[][] dead = new boolean[grid.size()][grid.get(0).length()];
                for (int x =0; x<grid.size(); x++) {
                    for (int y = 0; y < grid.get(0).length(); y++) {
                        if (check[x][y] == 1) {
                            dead[x][y] = true;
                            for (int dxIdx = 0; dxIdx < dx.length; dxIdx++) {
                                int tempX = x + dx[dxIdx];
                                int tempY = y + dy[dxIdx];
                                if (tempX >= 0 && tempX < grid.size() && tempY >= 0 && tempY < grid.get(0).length()) {
                                    dead[tempX][tempY] = true;
                                }
                            }
                        }
                    }
                }

                for (int x=0; x<grid.size(); x++) {
                    for (int y = 0; y < grid.get(0).length(); y++) {
                        if(dead[x][y])
                            check[x][y] = 0;
                        else if(check[x][y] > 0) {
                            check[x][y]--;
                        }
                    }
                }
            }
            System.out.println(check);
        }

        List<String> result = new ArrayList<>();
        for (int x=0; x<grid.size(); x++) {
            StringBuilder sb = new StringBuilder();
            for (int y=0; y<grid.get(0).length(); y++) {
                if (check[x][y] == 0) sb.append(".");
                else sb.append("O");
            }
            result.add(sb.toString());
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = Result.bomberMan(n, grid);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
