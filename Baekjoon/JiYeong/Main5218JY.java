package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main5218JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            list.add(br.readLine());
        }

        for(String s : list) {
            char[] temp0 = s.split(" ")[0].toCharArray();
            char[] temp1 = s.split(" ")[1].toCharArray();
            System.out.print("Distances: ");
            for(int i=0; i < temp0.length; i++) {
                if (temp1[i] - temp0[i] < 0) {
                    System.out.print(26 + temp1[i] - temp0[i] + " ");
                } else {
                    System.out.print(temp1[i] - temp0[i] + " ");
                }
            }
            System.out.println("");
        }
    }
}
