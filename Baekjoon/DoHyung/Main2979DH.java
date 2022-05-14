package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2979DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int firstIn = Integer.parseInt(st.nextToken());
        int firstOut = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int secondIn = Integer.parseInt(st.nextToken());
        int secondOut = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int thirdIn = Integer.parseInt(st.nextToken());
        int thirdOut = Integer.parseInt(st.nextToken());

        int latest = Math.max(firstOut, Math.max(secondOut, thirdOut));
        int[] parking = new int[latest];

        for (int i=firstIn;i<firstOut;i++) {
            parking[i]++;
        }

        for (int i=secondIn;i<secondOut;i++) {
            parking[i]++;
        }

        for (int i=thirdIn;i<thirdOut;i++) {
            parking[i]++;
        }

        int count = 0;
        for (int i=0;i<parking.length;i++) {
            if (parking[i] == 1) {
                count += a;
            } else if (parking[i] == 2) {
                count += 2*b;
            } else if (parking[i] == 3) {
                count += 3 * c;
            }
        }

        System.out.println(count);
    }

}

