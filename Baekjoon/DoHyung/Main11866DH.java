package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11866DH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> queue = new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
            queue.add(i);
        }

        int index = 0;
        StringBuilder sb = new StringBuilder("<");
        while (queue.size() > 1) {
            index = (index+k-1)%n;
            sb.append(queue.get(index)+1).append(", ");
            queue.remove(index);
            n--;
        }
        sb.append(queue.get(0)+1).append(">");

        System.out.println(sb);
    }
}
