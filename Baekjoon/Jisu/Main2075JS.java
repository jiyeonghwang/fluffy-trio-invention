package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2075JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i<num; i++){
            String[] innerArr = br.readLine().split(" ");
            for (int j = 0; j<num; j++){
                q.add(Integer.parseInt(innerArr[j]));
                if (q.size() > num){
                    q.poll();
                }
            }
        }
        System.out.println(q.poll());
    }
}
