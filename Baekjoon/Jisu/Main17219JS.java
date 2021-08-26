package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main17219JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        HashMap<String, String> siteMap = new HashMap<>();
        for (int i=0; i<total; i++){
            st = new StringTokenizer(br.readLine());
            siteMap.put(st.nextToken(), st.nextToken());
        }

        for (int j=0; j<target; j++){
            sb.append(siteMap.get(br.readLine())).append("\n");
        }
        System.out.print(sb);
    }
}
