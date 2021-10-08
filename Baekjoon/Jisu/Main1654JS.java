package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1654JS {
    public static int isPossible(long lanCable, int[] arr){
        int count = 0;
        for(int x:arr) {
            count+=x/lanCable;
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int haveNum = Integer.parseInt(st.nextToken());
        int requireNum = Integer.parseInt(st.nextToken());

        int[] haveArr = new int[haveNum];
        for (int i=0; i<haveNum; i++){
            haveArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(haveArr);
        long start = 1, end = haveArr[haveNum-1], answer = 0;
        while(start<=end){
            long mid = (start+end)/2;
            if (isPossible(mid, haveArr)<requireNum) end = mid-1;
            else {
                start = mid+1;
                answer = mid;
            }
        }

        System.out.println(answer);
    }
}
