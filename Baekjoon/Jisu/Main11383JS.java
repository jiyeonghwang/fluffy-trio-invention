package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11383JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lineOne = br.readLine().split(" ");
        int line = Integer.parseInt(lineOne[0]);
        String[] firstImage = new String[line];
        String[] secondImage = new String[line];
        boolean flag = true;

        for(int i = 0; i<line; i++){
            firstImage[i] = br.readLine();
        }
        for(int j = 0; j<line; j++){
            secondImage[j] = br.readLine();
        }
        for(int x = 0; x<line ; x++){
            StringBuilder answer = new StringBuilder();
            for(int y = 0; y<firstImage[x].length(); y++){
                answer.append(firstImage[x].charAt(y));
                answer.append(firstImage[x].charAt(y));
            }
            if (! answer.toString().equals(secondImage[x])) flag = false;
        }
        if (flag) System.out.println("Eyfa");
        else System.out.println("Not Eyfa");
    }
}
