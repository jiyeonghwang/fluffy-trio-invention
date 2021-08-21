package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10205JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int setCnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<setCnt; i++) {
            int count = Integer.parseInt(br.readLine());
            char[] temp = br.readLine().toCharArray();

            for(char c : temp) {
                if (c=='c') {
                    count++;
                } else {
                    count--;
                    if(count==0) {
                        break;
                    }
                }
            }

            sb.append("Data Set " + (i+1) + ":\n" + count + "\n\n");
        }
        System.out.println(sb.toString());
    }
}
