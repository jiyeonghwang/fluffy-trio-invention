package Jisu;

import java.io.*;

public class Main20540JS {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";

        if (str.charAt(0) == 'E') answer += "I";
        else answer += "E";

        if (str.charAt(1) == 'S') answer += "N";
        else answer += "S";

        if (str.charAt(2) == 'T') answer += "F";
        else answer += "T";

        if (str.charAt(3) == 'J') answer += "P";
        else answer += "J";

        System.out.println(answer);
    }
}
