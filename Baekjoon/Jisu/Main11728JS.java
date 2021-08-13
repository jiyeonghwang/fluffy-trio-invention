package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main11728JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] numArray = br.readLine().split(" ");
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        int p1 = 0, p2 = 0;
        List<Integer> answer = new ArrayList<>();

        while(p1<Integer.parseInt(numArray[0]) && p2<Integer.parseInt(numArray[1])){
            int element1 = Integer.parseInt(arr1[p1]);
            int element2 = Integer.parseInt(arr2[p2]);
            if (element1 >  element2) {
                answer.add(element2);
                p2+=1;
            }
            else {
                answer.add(element1);
                p1+=1;
            }
        }
        while(p1<Integer.parseInt(numArray[0])) {
            answer.add(Integer.parseInt(arr1[p1]));
            p1+=1;
        }
        while(p2<Integer.parseInt(numArray[1])) {
            answer.add(Integer.parseInt(arr2[p2]));
            p2+=1;
        }

        for (int i:answer) sb.append(i+" ");
        System.out.println(sb);
    }
}
