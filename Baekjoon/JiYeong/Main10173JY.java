package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main10173JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();
        String str = "";
        int count = 0;

        while(!(str=br.readLine()).equals("EOI")) {
            str = str.toUpperCase();
            String[] temp = str.split(" ");
            for(String st : temp) {
                if(st.replaceAll("[^A-Z]", "").equals("NEMO")) {
                    count++;
                }
            }

            if(count != 0) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
            count = 0;
        }
    }
}
