package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5671JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if (input == null) break;
            String[] array = input.split(" ");
            int count = 0;
            for(int i = Integer.parseInt(array[0]); i<=Integer.parseInt(array[1]); i++ ){
                String number = String.valueOf(i);
                boolean flag = true;
                char[] numArray = number.toCharArray();
                for (int x = 0; x<numArray.length; x++){
                    for (int y = x+1; y<numArray.length; y++){
                        if(numArray[x] == numArray[y]) {
                            flag =false;
                            break;
                        }
                    }
                    if (!flag) break;
                }
                if (flag) count += 1;
            }
            System.out.println(count);
        }
    }
}
