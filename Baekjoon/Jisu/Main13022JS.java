package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main13022JS{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String regex = "(w+o+l+f+)+";

        int wCount = 0, oCount = 0, lCount = 0, fCount = 0;
        boolean check = true;

        for(int i=0; i<word.length(); i++){
            if (word.charAt(i) == 'w') wCount+=1;
            else if (word.charAt(i) == 'o') oCount+=1;
            else if (word.charAt(i) == 'l') lCount+=1;
            else if (word.charAt(i) == 'f') fCount+=1;

            if(i<word.length()-1 && word.charAt(i) == 'f' && word.charAt(i+1) == 'w'){
                if(!(wCount == oCount && oCount == lCount && lCount == fCount && fCount == wCount)){
                    check = false;
                    break;
                }
            }
        }

        if(
            check && word.matches(regex)
            && wCount == oCount && oCount == lCount && lCount == fCount && fCount == wCount
        ) System.out.println(1);
        else System.out.println(0);

    }
}
