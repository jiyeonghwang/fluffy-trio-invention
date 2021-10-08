package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main11651JS {
    public static class Point implements Comparable<Point>{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point point){
            if (point.y == y) return this.x - point.x;
            else return this.y - point.y;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pointNum = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Point> pointList = new ArrayList<>();
        for(int i=0; i<pointNum; i++){
            st = new StringTokenizer(br.readLine());
            Point point = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            pointList.add(point);
        }
        Collections.sort(pointList);

        StringBuilder sb = new StringBuilder();
        for (Point point:pointList) sb.append(point.x).append(" ").append(point.y).append("\n");
        System.out.println(sb);
    }
}
