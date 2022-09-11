package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main20291DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nOfFiles = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0;i<nOfFiles;i++) {
            String[] file = br.readLine().split("\\.");

            map.put(file[1], map.getOrDefault(file[1],0)+1);
        }

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (String key:keys) {
            sb.append(key+" "+map.get(key)+"\n");
        }

        System.out.println(sb);
    }
}