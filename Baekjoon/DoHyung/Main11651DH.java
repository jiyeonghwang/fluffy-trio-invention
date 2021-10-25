package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11651DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Coordinate[] coordinates = new Coordinate[n];

        for (int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i] = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(coordinates);

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append(coordinates[i].getX()).append(" ").append(coordinates[i].getY()).append("\n");
        }

        System.out.println(sb);
    }
}

class Coordinate implements Comparable<Coordinate>{
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.y == c.y) {
            return this.x-c.x;
        }

        return this.y - c.y;
    }
}

