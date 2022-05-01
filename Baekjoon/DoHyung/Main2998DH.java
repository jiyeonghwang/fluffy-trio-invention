package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main2998DH {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        map.put("000","0");
        map.put("001","1");
        map.put("010","2");
        map.put("011","3");
        map.put("100","4");
        map.put("101","5");
        map.put("110","6");
        map.put("111","7");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input.length()%3 != 0) {
            int add = (input.length()/3+1)*3-input.length();
            for (int i=0;i<add;i++) {
                input = "0"+input;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<input.length();i=i+3) {
            sb.append(map.get(input.substring(i,i+3)));
        }

        System.out.println(sb);
    }
}
