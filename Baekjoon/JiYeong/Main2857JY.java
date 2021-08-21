package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main2857JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<5; i++) {
            list.add(br.readLine());
        }

        for (int i=0; i<5; i++) {
            if(list.get(i).indexOf("FBI")!=-1) {
                sb.append(i+1);
                sb.append(" ");
            }
        }


        if (sb.length() == 0){
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(sb);
        }
    }
}
