package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main11383JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");

        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<Integer.parseInt(size[0])*2; i++) {
            list.add(br.readLine());
        }

        int count = 0;
        for(int i=0; i<Integer.parseInt(size[0]); i++) {
            char[] c = list.get(i).toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char x: c) {
                sb.append(x);
                sb.append(x);
            }
            if(sb.toString().equals(list.get(i+Integer.parseInt(size[0])))) {
                count++;
            }
        }

        if (count==Integer.parseInt(size[0])) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }
}
