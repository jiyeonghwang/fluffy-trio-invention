package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main10815JS {
    public static boolean Compare(int num, int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] > num) end = mid-1;
            else if (arr[mid] < num) start = mid+1;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cardNum = Integer.parseInt(br.readLine());
        int[] cardArr = new int[cardNum];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<cardNum; i++){
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        int compareNum = Integer.parseInt(br.readLine());
        int[] compareArr = new int[compareNum];
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<compareNum; j++){
            compareArr[j] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(cardArr);
        for (int x=0; x<compareNum; x++){
            if (Compare(compareArr[x], cardArr)) sb.append("1").append(" ");
            else sb.append("0").append(" ");
        }
        System.out.println(sb);
    }
}
