package Jisu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1138JS {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] people = new int[n];

        for(int i=0; i<n; i++) people[i] = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            answer.add(people[i], i+1);
        }

        for(int x:answer) System.out.print(x+" ");
    }
}