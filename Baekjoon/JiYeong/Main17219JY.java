package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main17219JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int siteCnt = Integer.parseInt(st.nextToken());
        int pwCnt = Integer.parseInt(st.nextToken());

        HashMap site = new HashMap();
        for(int i=0; i<siteCnt; i++) {
            st = new StringTokenizer(br.readLine());
            site.put(st.nextToken(), st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<pwCnt; i++) {
            list.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for(String s : list) {
            sb.append(site.get(s)+"\n");
        }

        System.out.println(sb);
    }
}
