package Jisu;

import java.io.*;

public class Main20944JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i += 1) {
            builder.append("a");
        }
        System.out.println(builder);
    }
}
