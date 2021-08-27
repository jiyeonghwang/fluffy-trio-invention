package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main7785JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        HashSet set = new HashSet();
        StringTokenizer st = null;
        String name = "";
        String cag = "";
        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            cag = st.nextToken();

            if (cag.equals("enter")) set.add(name);
            else set.remove(name);
        }

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>(set);
        list.sort(Comparator.reverseOrder());
        for(String s : list) {
            sb.append(s+"\n");
        }
        System.out.println(sb);
    }
}
