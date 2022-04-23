package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main4641JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if (input.equals("-1")) break;

            String[] inputArr = input.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for(String x:inputArr){
                if(! x.equals("0")) numbers.add(Integer.parseInt(x));
            }

            int answer = 0;
            for(int x:numbers){
                if(numbers.contains(x*2)) answer+=1;
            }
            System.out.println(answer);
        }
    }
}
