package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main20291JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] files = new String[n];
        for(int i=0; i<n; i++){
            files[i] = br.readLine();
        }

        Map<String, Integer> fileMap = new TreeMap<String, Integer>();
        for(String file:files){
            String extension = file.split("\\.")[1];
            fileMap.put(extension, fileMap.getOrDefault(extension, 0)+1);
        }

        for(String key:fileMap.keySet()){
            System.out.println(key+" "+fileMap.get(key));
        }
    }
}
