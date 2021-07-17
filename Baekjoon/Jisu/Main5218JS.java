package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5218JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String[] strArray = str.split(" ");
            char[] array1 = strArray[0].toCharArray();
            char[] array2 = strArray[1].toCharArray();
            int[] answer = new int[array1.length];
            for (int j = 0; j < array1.length; j++){
                if (array1[j] > array2[j]) answer[j] = (array2[j] + 26) - array1[j];
                else answer[j] = array2[j] - array1[j];
            }
            System.out.print("Distances: ");
            for (int x:answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
