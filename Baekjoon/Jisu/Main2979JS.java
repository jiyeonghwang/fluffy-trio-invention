package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2979JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] price = br.readLine().split(" ");

        int a = Integer.parseInt(price[0]);
        int b = Integer.parseInt(price[1]);
        int c = Integer.parseInt(price[2]);

        String[] truck1 = br.readLine().split(" ");
        String[] truck2 = br.readLine().split(" ");
        String[] truck3 = br.readLine().split(" ");

        int in = Math.min(
            Integer.parseInt(truck1[0]),
            Math.min(Integer.parseInt(truck2[0]), Integer.parseInt(truck3[0]))
        );
        int out = Math.max(
                Integer.parseInt(truck1[1]),
                Math.max(Integer.parseInt(truck2[1]), Integer.parseInt(truck3[1]))
        );

        int answer = 0;
        for(int i=in; i<out; i++){
            int truck = 0;
            if(Integer.parseInt(truck1[0])<=i && Integer.parseInt(truck1[1])-1>=i) truck+=1;
            if(Integer.parseInt(truck2[0])<=i && Integer.parseInt(truck2[1])-1>=i) truck+=1;
            if(Integer.parseInt(truck3[0])<=i && Integer.parseInt(truck3[1])-1>=i) truck+=1;

            if(truck==1) answer+=a;
            else if (truck==2) answer+=(2*b);
            else if(truck==3) answer+=(3*c);
        }
        System.out.println(answer);
    }
}
