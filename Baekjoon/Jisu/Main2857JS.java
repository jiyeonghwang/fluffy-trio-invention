package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2857JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringArray = new ArrayList<>();
        for (int i = 0; i < 5; i ++) stringArray.add(br.readLine());

        int count = 0;
        for (int j = 0; j < stringArray.size(); j ++) {
            if (stringArray.get(j).contains("FBI")) {
                System.out.print( j + 1 +" ");
            } else count += 1;
            if (count == stringArray.size()) System.out.print("HE GOT AWAY!");
        }
    }
}
