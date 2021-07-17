package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main10173JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringArray = new ArrayList<>();
        while (true){
            String str = br.readLine();
            if (str.equals("EOI")) break;
            else stringArray.add(str.toLowerCase());
        }

        for (String s : stringArray) {
            if (s.contains("nemo")) System.out.println("Found");
            else System.out.println("Missing");
        }
    }
}
