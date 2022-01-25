package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11399JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[num];
        for(int i=0; i<num; i++) time[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(time);
        int answer = time[0];
        for(int i=1; i<num; i++){
            for(int j=0; j<=i; j++){
                answer+=time[j];
            }
        }
        System.out.println(answer);
    }
}
