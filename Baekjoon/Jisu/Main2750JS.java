package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2750JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 선택 정렬
        for(int x=0; x<num-1; x++){
            int idx = x;
            for(int y=x+1; y<num; y++){
                if(arr[y] < arr[idx]) idx = y;
            }
            int tmp = arr[x];
            arr[x] = arr[idx];
            arr[idx] = tmp;
        }


        // 삽입 정렬
        for (int x=1; x<num; x++){
            int tmp = arr[x], y;
            for(y=x-1; y>=0; y--){
                if(arr[y] > tmp) {
                    arr[y+1] = arr[y];
                }
                else break;
            }
            arr[y+1] = tmp;
        }

        for(int x:arr){
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
