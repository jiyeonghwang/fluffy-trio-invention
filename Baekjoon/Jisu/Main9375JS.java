package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main9375JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int current = 0;

        while (current<testCase){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> clothMap = new HashMap<>();
            int answer = 1;
            for(int i=0; i<n; i++){
                String category = br.readLine().split(" ")[1];
                clothMap.put(category, clothMap.getOrDefault(category, 0)+1);

            }

            for(String key: clothMap.keySet()){
                answer *= clothMap.get(key) +1;
            }
            System.out.println(answer-1);
            current+=1;
        }
    }
}
